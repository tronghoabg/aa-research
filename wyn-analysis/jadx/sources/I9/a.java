package I9;

import android.util.Log;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f5432a;

    /* renamed from: b, reason: collision with root package name */
    public int f5433b;

    public a(int i5) {
        switch (i5) {
            case 2:
                this.f5432a = new ArrayList();
                this.f5433b = 0;
                break;
            default:
                this.f5432a = new ArrayList();
                this.f5433b = 128;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ff A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.Object r28) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I9.a.a(java.lang.Object):void");
    }

    public synchronized List b() {
        return DesugarCollections.unmodifiableList(new ArrayList(this.f5432a));
    }

    public synchronized boolean c(List list) {
        this.f5432a.clear();
        if (list.size() <= this.f5433b) {
            return this.f5432a.addAll(list);
        }
        Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f5433b, null);
        return this.f5432a.addAll(list.subList(0, this.f5433b));
    }
}
