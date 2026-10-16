package Af;

import com.unity3d.services.core.network.domain.CleanupDirectory$invoke$$inlined$sortedBy$1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class j implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1310a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1311b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1312c;

    public j(File start) {
        qf.h hVar = qf.h.f44276a;
        AbstractC3340k.e(start, "start");
        this.f1311b = start;
        this.f1312c = hVar;
    }

    @Override // Af.k
    public final Iterator iterator() {
        switch (this.f1310a) {
            case 0:
                return new i(this);
            case 1:
                o oVar = (o) this.f1311b;
                ArrayList arrayList = new ArrayList();
                Iterator it = oVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                ff.s.d0(arrayList, (CleanupDirectory$invoke$$inlined$sortedBy$1) this.f1312c);
                return arrayList.iterator();
            case 2:
                return new f(this);
            case 3:
                return new Bf.b(this);
            default:
                return new qf.f(this);
        }
    }

    public j(k kVar, tf.l predicate) {
        AbstractC3340k.e(predicate, "predicate");
        this.f1311b = kVar;
        this.f1312c = predicate;
    }

    public j(tf.a aVar, tf.l getNextValue) {
        AbstractC3340k.e(getNextValue, "getNextValue");
        this.f1311b = aVar;
        this.f1312c = getNextValue;
    }

    public j(o oVar, CleanupDirectory$invoke$$inlined$sortedBy$1 cleanupDirectory$invoke$$inlined$sortedBy$1) {
        this.f1311b = oVar;
        this.f1312c = cleanupDirectory$invoke$$inlined$sortedBy$1;
    }

    public j(CharSequence input, tf.p pVar) {
        AbstractC3340k.e(input, "input");
        this.f1311b = input;
        this.f1312c = pVar;
    }
}
