package Yf;

import A.e0;
import Wf.AbstractC1240b0;
import ff.AbstractC2640A;
import ff.AbstractC2645F;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public class v extends AbstractC1295a {

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.serialization.json.c f16885f;

    /* renamed from: g, reason: collision with root package name */
    public final SerialDescriptor f16886g;

    /* renamed from: h, reason: collision with root package name */
    public int f16887h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16888i;

    public /* synthetic */ v(Xf.c cVar, kotlinx.serialization.json.c cVar2, String str, int i5) {
        this(cVar, cVar2, (i5 & 4) != 0 ? null : str, (SerialDescriptor) null);
    }

    @Override // Yf.AbstractC1295a, kotlinx.serialization.encoding.Decoder
    public final boolean A() {
        return !this.f16888i && super.A();
    }

    @Override // Yf.AbstractC1295a
    public kotlinx.serialization.json.b F(String tag) {
        AbstractC3340k.e(tag, "tag");
        return (kotlinx.serialization.json.b) AbstractC2640A.P(tag, T());
    }

    @Override // Yf.AbstractC1295a
    public String R(SerialDescriptor descriptor, int i5) {
        Object next;
        AbstractC3340k.e(descriptor, "descriptor");
        Xf.c cVar = this.f16844c;
        r.n(cVar, descriptor);
        String strE = descriptor.e(i5);
        if (this.f16846e.f16278i && !T().f39780a.keySet().contains(strE)) {
            AbstractC3340k.e(cVar, "<this>");
            s sVar = r.f16874a;
            Bf.g gVar = new Bf.g(3, descriptor, cVar);
            e0 e0Var = cVar.f16254c;
            e0Var.getClass();
            Object objN = e0Var.n(descriptor, sVar);
            if (objN == null) {
                objN = gVar.invoke();
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) e0Var.f152b;
                Object concurrentHashMap2 = concurrentHashMap.get(descriptor);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(descriptor, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(sVar, objN);
            }
            Map map = (Map) objN;
            Iterator it = T().f39780a.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Integer num = (Integer) map.get((String) next);
                if (num != null && num.intValue() == i5) {
                    break;
                }
            }
            String str = (String) next;
            if (str != null) {
                return str;
            }
        }
        return strE;
    }

    @Override // Yf.AbstractC1295a
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public kotlinx.serialization.json.c T() {
        return this.f16885f;
    }

    @Override // Yf.AbstractC1295a, kotlinx.serialization.encoding.Decoder
    public final Vf.a b(SerialDescriptor descriptor) {
        AbstractC3340k.e(descriptor, "descriptor");
        SerialDescriptor serialDescriptor = this.f16886g;
        if (descriptor != serialDescriptor) {
            return super.b(descriptor);
        }
        kotlinx.serialization.json.b bVarG = G();
        String strH = serialDescriptor.h();
        if (bVarG instanceof kotlinx.serialization.json.c) {
            return new v(this.f16844c, (kotlinx.serialization.json.c) bVarG, this.f16845d, serialDescriptor);
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        kotlin.jvm.internal.I i5 = kotlin.jvm.internal.H.f39741a;
        sb2.append(i5.getOrCreateKotlinClass(kotlinx.serialization.json.c.class).getSimpleName());
        sb2.append(", but had ");
        sb2.append(i5.getOrCreateKotlinClass(bVarG.getClass()).getSimpleName());
        sb2.append(" as the serialized body of ");
        sb2.append(strH);
        sb2.append(" at element: ");
        sb2.append(V());
        throw r.c(-1, bVarG.toString(), sb2.toString());
    }

    @Override // Yf.AbstractC1295a, Vf.a
    public void c(SerialDescriptor descriptor) {
        Set setZ;
        AbstractC3340k.e(descriptor, "descriptor");
        Xf.c cVar = this.f16844c;
        if (r.k(cVar, descriptor) || (descriptor.getKind() instanceof Uf.d)) {
            return;
        }
        r.n(cVar, descriptor);
        if (this.f16846e.f16278i) {
            Set setB = AbstractC1240b0.b(descriptor);
            Map map = (Map) cVar.f16254c.n(descriptor, r.f16874a);
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = ff.x.f35434a;
            }
            setZ = AbstractC2645F.Z(setB, setKeySet);
        } else {
            setZ = AbstractC1240b0.b(descriptor);
        }
        for (String str : T().f39780a.keySet()) {
            if (!setZ.contains(str) && !AbstractC3340k.a(str, this.f16845d)) {
                StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("Encountered an unknown key '", str, "' at element: ");
                sbW.append(V());
                sbW.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
                sbW.append((Object) r.m(T().toString(), -1));
                throw r.d(-1, sbW.toString());
            }
        }
    }

    @Override // Vf.a
    public int m(SerialDescriptor descriptor) {
        AbstractC3340k.e(descriptor, "descriptor");
        while (this.f16887h < descriptor.d()) {
            int i5 = this.f16887h;
            this.f16887h = i5 + 1;
            String strS = S(descriptor, i5);
            int i10 = this.f16887h - 1;
            this.f16888i = false;
            if (!T().containsKey(strS)) {
                boolean z2 = (this.f16844c.f16252a.f16275f || descriptor.i(i10) || !descriptor.g(i10).b()) ? false : true;
                this.f16888i = z2;
                if (z2) {
                }
            }
            this.f16846e.getClass();
            return i10;
        }
        return -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Xf.c json, kotlinx.serialization.json.c value, String str, SerialDescriptor serialDescriptor) {
        super(json, str);
        AbstractC3340k.e(json, "json");
        AbstractC3340k.e(value, "value");
        this.f16885f = value;
        this.f16886g = serialDescriptor;
    }
}
