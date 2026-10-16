package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class aipd {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static /* synthetic */ int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static <N, R> R dfs(Collection<N> collection, aioz<N> aiozVar, aipb<N> aipbVar, aipa<N, R> aipaVar) {
        if (collection == null) {
            $$$reportNull$$$0(0);
        }
        if (aiozVar == null) {
            $$$reportNull$$$0(1);
        }
        if (aipbVar == null) {
            $$$reportNull$$$0(2);
        }
        if (aipaVar == null) {
            $$$reportNull$$$0(3);
        }
        Iterator<N> it = collection.iterator();
        while (it.hasNext()) {
            doDfs(it.next(), aiozVar, aipbVar, aipaVar);
        }
        return aipaVar.result();
    }

    public static <N> void doDfs(N n, aioz<N> aiozVar, aipb<N> aipbVar, aipa<N, ?> aipaVar) {
        if (n == null) {
            $$$reportNull$$$0(22);
        }
        if (aiozVar == null) {
            $$$reportNull$$$0(23);
        }
        if (aipbVar == null) {
            $$$reportNull$$$0(24);
        }
        if (aipaVar == null) {
            $$$reportNull$$$0(25);
        }
        if (aipbVar.checkAndMarkVisited(n) && aipaVar.beforeChildren(n)) {
            Iterator<? extends N> it = aiozVar.getNeighbors(n).iterator();
            while (it.hasNext()) {
                doDfs(it.next(), aiozVar, aipbVar, aipaVar);
            }
            aipaVar.afterChildren(n);
        }
    }

    public static <N> Boolean ifAny(Collection<N> collection, aioz<N> aiozVar, afec<N, Boolean> afecVar) {
        if (collection == null) {
            $$$reportNull$$$0(7);
        }
        if (aiozVar == null) {
            $$$reportNull$$$0(8);
        }
        if (afecVar == null) {
            $$$reportNull$$$0(9);
        }
        return (Boolean) dfs(collection, aiozVar, new aiox(afecVar, new boolean[1]));
    }

    public static <N, R> R dfs(Collection<N> collection, aioz<N> aiozVar, aipa<N, R> aipaVar) {
        if (collection == null) {
            $$$reportNull$$$0(4);
        }
        if (aiozVar == null) {
            $$$reportNull$$$0(5);
        }
        if (aipaVar == null) {
            $$$reportNull$$$0(6);
        }
        return (R) dfs(collection, aiozVar, new aipc(), aipaVar);
    }
}
