# Hero Builder Pattern

Builder pattern implementation for Assignment 1 — ShP-2216 (Software Design Patterns).

## What it is
A `Hero` product built through two concrete builders, `MeleeHeroBuilder` and
`RangeHeroBuilder`, each enforcing different construction rules. A `HeroDirector`
provides reusable role presets: Assassin, Tank, Healer, Shooter.

## Structure
- `Hero` — immutable product, built via constructor + getters only
- `HeroBuilder` — builder interface (shared setter contract)
- `AbstractHeroBuilder` — shared setters and base validation logic
- `MeleeHeroBuilder` — forces `MELEE` weapon type and `CLOSE` range; requires hp ≥ 1000
- `RangeHeroBuilder` — forces `RANGED` weapon type; allows `MID`/`FAR` range only
- `HeroDirector` — reusable build recipes (Assassin, Tank, Healer, Shooter)
- `Main` — client demo

## How to build each representation
- Melee hero: `new MeleeHeroBuilder().setName(...).setHp(...)...build()`
- Ranged hero: `new RangeHeroBuilder().setName(...)...setAttackRange(AttackRange.FAR).build()`
- Or via Director: `director.buildAssasinHero(new MeleeHeroBuilder())`

## How to run
Run `Main.java`. It demonstrates all four Director recipes, a custom hero built
without the Director, and a validation failure case (`IllegalStateException`
when a Melee hero's hp is set below 1000).