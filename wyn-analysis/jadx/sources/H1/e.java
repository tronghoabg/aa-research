package h1;

import android.content.Context;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35945a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f35946b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f35947c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f35948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f35949e;

    public /* synthetic */ e(String str, Context context, Object obj, int i5, int i10) {
        this.f35945a = i10;
        this.f35946b = str;
        this.f35947c = context;
        this.f35949e = obj;
        this.f35948d = i5;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i5 = this.f35948d;
        Object obj = this.f35949e;
        Context context = this.f35947c;
        String str = this.f35946b;
        switch (this.f35945a) {
            case 0:
                Object[] objArr = {(d) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return h.b(str, context, DesugarCollections.unmodifiableList(arrayList), i5);
            default:
                try {
                    return h.b(str, context, (List) obj, i5);
                } catch (Throwable unused) {
                    return new g(-3);
                }
        }
    }
}
