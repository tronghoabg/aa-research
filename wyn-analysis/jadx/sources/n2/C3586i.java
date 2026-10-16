package n2;

import N1.T;
import Q1.x;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import j$.util.Objects;
import java.util.Map;
import k2.n0;

/* renamed from: n2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3586i extends T {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f40847A = 0;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f40848r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f40849s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f40850t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f40851u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f40852v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f40853w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f40854x;

    /* renamed from: y, reason: collision with root package name */
    public final SparseArray f40855y;

    /* renamed from: z, reason: collision with root package name */
    public final SparseBooleanArray f40856z;

    static {
        new C3586i(new C3585h());
        x.E(1000);
        x.E(1001);
        x.E(BackupConstant.SCENE_BACKUP_RENDER_FAIL);
        x.E(BackupConstant.SCENE_CLOSED_WITHOUT_SHOW);
        N0.a.k(1004, WebSocketProtocol.CLOSE_NO_STATUS_CODE, 1006, 1007, 1008);
        N0.a.k(1009, TTAdConstant.IMAGE_MODE_1010, TTAdConstant.IMAGE_MODE_1011, TTAdConstant.IMAGE_MODE_1012, 1013);
        N0.a.k(1014, 1015, 1016, 1017, 1018);
    }

    public C3586i(C3585h c3585h) {
        super(c3585h);
        this.f40848r = c3585h.f40838r;
        this.f40849s = c3585h.f40839s;
        this.f40850t = c3585h.f40840t;
        this.f40851u = c3585h.f40841u;
        this.f40852v = c3585h.f40842v;
        this.f40853w = c3585h.f40843w;
        this.f40854x = c3585h.f40844x;
        this.f40855y = c3585h.f40845y;
        this.f40856z = c3585h.f40846z;
    }

    @Override // N1.T
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && C3586i.class == obj.getClass()) {
                C3586i c3586i = (C3586i) obj;
                if (super.equals(c3586i) && this.f40848r == c3586i.f40848r && this.f40849s == c3586i.f40849s && this.f40850t == c3586i.f40850t && this.f40851u == c3586i.f40851u && this.f40852v == c3586i.f40852v && this.f40853w == c3586i.f40853w && this.f40854x == c3586i.f40854x) {
                    SparseBooleanArray sparseBooleanArray = this.f40856z;
                    int size = sparseBooleanArray.size();
                    SparseBooleanArray sparseBooleanArray2 = c3586i.f40856z;
                    if (sparseBooleanArray2.size() == size) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size) {
                                SparseArray sparseArray = this.f40855y;
                                int size2 = sparseArray.size();
                                SparseArray sparseArray2 = c3586i.f40855y;
                                if (sparseArray2.size() == size2) {
                                    for (int i10 = 0; i10 < size2; i10++) {
                                        int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                                        if (iIndexOfKey >= 0) {
                                            Map map = (Map) sparseArray.valueAt(i10);
                                            Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                            if (map2.size() == map.size()) {
                                                for (Map.Entry entry : map.entrySet()) {
                                                    n0 n0Var = (n0) entry.getKey();
                                                    if (map2.containsKey(n0Var)) {
                                                        Object value = entry.getValue();
                                                        Object obj2 = map2.get(n0Var);
                                                        int i11 = x.f9724a;
                                                        if (!Objects.equals(value, obj2)) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i5)) < 0) {
                                    break;
                                }
                                i5++;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // N1.T
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f40848r ? 1 : 0)) * 961) + (this.f40849s ? 1 : 0)) * 961) + (this.f40850t ? 1 : 0)) * 28629151) + (this.f40851u ? 1 : 0)) * 31) + (this.f40852v ? 1 : 0)) * 31) + (this.f40853w ? 1 : 0)) * 961) + (this.f40854x ? 1 : 0)) * 31;
    }
}
