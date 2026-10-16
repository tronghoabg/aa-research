package Uf;

import ff.v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f12794a;

    /* renamed from: b, reason: collision with root package name */
    public List f12795b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f12796c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f12797d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f12798e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f12799f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f12800g;

    public a(String serialName) {
        AbstractC3340k.e(serialName, "serialName");
        this.f12794a = serialName;
        this.f12795b = v.f35432a;
        this.f12796c = new ArrayList();
        this.f12797d = new HashSet();
        this.f12798e = new ArrayList();
        this.f12799f = new ArrayList();
        this.f12800g = new ArrayList();
    }

    public static void a(a aVar, String str, SerialDescriptor descriptor) {
        v vVar = v.f35432a;
        aVar.getClass();
        AbstractC3340k.e(descriptor, "descriptor");
        if (!aVar.f12797d.add(str)) {
            StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("Element with name '", str, "' is already registered in ");
            sbW.append(aVar.f12794a);
            throw new IllegalArgumentException(sbW.toString().toString());
        }
        aVar.f12796c.add(str);
        aVar.f12798e.add(descriptor);
        aVar.f12799f.add(vVar);
        aVar.f12800g.add(false);
    }
}
