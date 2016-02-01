/**
 * Created by aandra1 on 29/01/16.
 */
public class QuickUnion {

  int[] ids;

  public QuickUnion(int N) {
    ids = new int[N];

    for (int i = 0; i < N; i++) {
      ids[i] = i;
    }
  }

  private int root(int element) {
    while (element != ids[element]) element = ids[element];
    return element;
  }

  public boolean connected(int p, int q) {
    return root(p) == root(q);
  }

  public void union(int p, int q) {
    int i = root(p);
    int j = root(q);
    ids[i] = j;
  }
}





