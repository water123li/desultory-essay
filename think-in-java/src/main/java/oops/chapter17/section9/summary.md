## Hash..
- 优秀的随机读取能力
- 散列码(处理后)其实是下标
- 迭代不如Linked
- (HashMap与HashSet可调负载因子*)

## Linked..
- 链表
- 按插入顺序排列
- 优秀的插入/移除元素的能力
- 迭代更快
- 捉急的随机读取能力


## Tree..
- 树
- 保持大小次序
- 所以元素要实现Comparable

### 负载因子表示桶位集的每个桶的饱和程度。
### 达到负载因子水平时，容量大致加倍，对象将被分布到新的桶位集中(再散列)
### 低负载因子：插入/查找更快，迭代更慢