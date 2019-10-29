# ![Blocks](icon-64.png) Blocks
Blocks is a voxel engine created for [jMonkeyEngine](https://jmonkeyengine.org).

[![Build Status](https://travis-ci.com/rvandoosselaer/Blocks.svg?token=EPZCRwE8MCLwXqyrYpqT&branch=master)](https://travis-ci.com/rvandoosselaer/Blocks)

## Features

**Multiple shapes**

Next to the default cube shape, Blocks also supports more complicated shapes like pyramids, wedges, slabs, stairs, ...
This will make your creations feel more vibrant!

**Theming support**

Don't like the look and feel of the blocks? You can easily change the default textures by creating and using a different theme. 

**Endless terrain**

Blocks comes with a fully fledged pager implementation that will only load the blocks around the player. Blocks that are out of sight will be unloaded to safe resources. 

**Optimized for performance**
 
Using multithreading, high demanding tasks like chunk generation and mesh creation can be run in parallel to maximize the CPU time.

**Designed for customization**

Blocks is build with modularity and reuse in mind. If a part of the framework doesn't match your requirements you can easily swap it out and replace it with something else.

mesh generation, persistence layer, ...

**Built using jMonkeyEngine best practices**

The lifecycle of the Blocks framework is managed by AppState objects. This way the Blocks framework can easily and safely be plugged into the StateManager of jMonkeyEngine.

## Documentation
General documentation can be found on the [wiki](https://github.com/rvandoosselaer/Blocks/wiki). The javadoc can be found at the [gh-pages.](https://rvandoosselaer.github.io/Blocks/javadoc/)

## Contributing
If you have a bug or an idea, you can create a ticket for it [here.](https://github.com/rvandoosselaer/Blocks/issues)

## License
This project is licensed under the BSD 3-Clause License - see the [LICENSE](LICENSE) file for details

## Acknowledgements
- Block textures made by [Ringoster](https://www.minecraftforum.net/members/Ringoster) from the TRITON pack. See [forum post](https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/resource-packs/2273313-triton-64x-512x-hd-cartoon-comic-style-concept-art?comment=577).
