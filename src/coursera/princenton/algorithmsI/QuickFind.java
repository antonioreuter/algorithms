package coursera.princenton.algorithmsI;

/**
 * Created by aandra1 on 29/01/16.
 */
public class QuickFind {

  private int[] ids;

  public QuickFind(int N) {
    ids = new int[N];

    for (int i = 0; i < N; i++) {
      ids[i] = i;
    }
  }

  public boolean connected(int p, int q) {
    return ids[p] == ids[q];
  }

  public void union(int p, int q) {
    int pid = ids[p];
    int qid = ids[q];

    for (int i = 0; i < ids.length; i++) {
      if (ids[i] == pid)
        ids[i] = qid;
    }
  }
}
