# StegSolve Legacy

合并统一基于[原作者 Caesum 的 Java 代码](http://www.caesum.com/handbook/Stegsolve.jar)的各主要流传版本 StegSolve，并进一步优化使用体验。

可在本仓库的 tags 中找到各版本的原始提交记录，以便对比。

## Todo (PRs welcome)

- [ ] 新增选项：图像缩放适应窗口大小（即拖动窗口边缘时始终让图像占满）
- [ ] 默认焦点放在切换图像而不是缩放（键盘方向键符合跟随焦点的惯例，但默认应该是切换图像）
- [ ] 子窗口添加缩放条
- [ ] 鼠标拖拽调整视图位置，滚轮缩放
- [ ] 十六进制文本域默认滚动至顶部，新增选项：仅显示十六进制/仅显示不带空格的文本，以便无需导出直接复制

## 1.5 changes [(by @souno-io, 2023-06-21)](https://github.com/souno-io/Stegsolve)

- 汉化部分内容
- 美化界面为 JetBrains 风格
- 修复原来 1.4 版本的帧浏览器、合并图片等功能的不显示图片 bug

## 1.4 changes [(by @Giotino, 2018-12-11)](https://github.com/Giotino/stegsolve)

- Added zoom to image
- Added drag&drop zone for files
- Added "all" option to channel planes in "Data Extract"
- Added horizontal scrolling (Shift+Mousewheel)
