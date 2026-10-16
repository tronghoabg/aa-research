package K3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class k extends Fe.e {

    /* renamed from: g, reason: collision with root package name */
    public static final String f6486g = J3.r.f("WorkContinuationImpl");

    /* renamed from: a, reason: collision with root package name */
    public final q f6487a;

    /* renamed from: b, reason: collision with root package name */
    public final List f6488b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6489c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f6490d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f6491e;

    /* renamed from: f, reason: collision with root package name */
    public S3.e f6492f;

    public k(q qVar, List list) {
        this.f6487a = qVar;
        this.f6488b = list;
        this.f6489c = new ArrayList(list.size());
        for (int i5 = 0; i5 < list.size(); i5++) {
            String string = ((J3.s) list.get(i5)).f5585a.toString();
            AbstractC3340k.d(string, "id.toString()");
            this.f6489c.add(string);
            this.f6490d.add(string);
        }
    }

    public static HashSet h0(k kVar) {
        HashSet hashSet = new HashSet();
        kVar.getClass();
        return hashSet;
    }
}
