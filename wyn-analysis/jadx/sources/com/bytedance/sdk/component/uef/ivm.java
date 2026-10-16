package com.bytedance.sdk.component.uef;

import com.bytedance.sdk.component.uef.yo;
import j$.util.Objects;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;

/* loaded from: classes.dex */
class ivm {
    private final com.bytedance.sdk.component.uef.uef bcc;
    private final xs uef;
    private final dj xs;

    /* renamed from: oa, reason: collision with root package name */
    private final Map<String, oa> f25086oa = new HashMap();
    private final bs<String, sy> yo = new bs<>();
    private final Map<String, yo.oa> moa = new HashMap();
    private final List<dz> lw = new ArrayList();
    private final Set<yo> ivm = new HashSet();

    public static final class uef {

        /* renamed from: oa, reason: collision with root package name */
        String f25088oa;
        boolean uef;

        private uef(boolean z2, String str) {
            this.uef = z2;
            this.f25088oa = str;
        }
    }

    public ivm(cz czVar, com.bytedance.sdk.component.uef.uef uefVar) {
        this.bcc = uefVar;
        this.uef = czVar.moa;
        this.xs = czVar.bcc;
    }

    public uef uef(dz dzVar, lw lwVar) throws Exception {
        oa oaVar = this.f25086oa.get(dzVar.moa);
        if (oaVar != null) {
            try {
                if (oaVar instanceof moa) {
                    dzVar.toString();
                    return uef(dzVar, (moa) oaVar, lwVar);
                }
            } catch (IllegalStateException unused) {
                dzVar.toString();
                this.lw.add(dzVar);
                return new uef(false, oib.uef());
            }
        }
        sy syVarUef = this.yo.uef(dzVar.moa);
        if (syVarUef != null) {
            dzVar.toString();
            return uef(dzVar, syVarUef, lwVar);
        }
        yo.oa oaVar2 = this.moa.get(dzVar.moa);
        if (oaVar2 == null) {
            dzVar.toString();
            return null;
        }
        yo yoVarUef = oaVar2.uef();
        yoVarUef.uef(dzVar.moa);
        dzVar.toString();
        return uef(dzVar, yoVarUef, lwVar);
    }

    public void uef(String str, moa<?, ?> moaVar) {
        moaVar.uef(str);
        this.f25086oa.put(str, moaVar);
    }

    public void uef(Set<String> set, sy<?, ?> syVar) {
        syVar.uef(set);
        this.yo.uef(set, syVar);
        Objects.toString(set);
    }

    public void uef(String str, yo.oa oaVar) {
        this.moa.put(str, oaVar);
    }

    public void uef() {
        Iterator<yo> it = this.ivm.iterator();
        while (it.hasNext()) {
            it.next().lw();
        }
        this.ivm.clear();
        this.f25086oa.clear();
        this.moa.clear();
        this.yo.uef();
    }

    private uef uef(dz dzVar, moa moaVar, lw lwVar) throws Exception {
        return new uef(true, oib.uef(this.uef.uef((xs) moaVar.uef(dzVar.moa, uef(dzVar.lw, (oa) moaVar), lwVar)), moaVar.oa()));
    }

    private uef uef(final dz dzVar, final yo yoVar, lw lwVar) throws Exception {
        this.ivm.add(yoVar);
        yoVar.uef(uef(dzVar.lw, yoVar), lwVar, new yo.uef() { // from class: com.bytedance.sdk.component.uef.ivm.1
            @Override // com.bytedance.sdk.component.uef.yo.uef
            public void uef(Object obj) {
                if (ivm.this.bcc == null) {
                    return;
                }
                ivm.this.bcc.oa(oib.uef(ivm.this.uef.uef((xs) obj), yoVar.oa()), dzVar);
                ivm.this.ivm.remove(yoVar);
            }

            @Override // com.bytedance.sdk.component.uef.yo.uef
            public void uef(Throwable th) {
                if (ivm.this.bcc == null) {
                    return;
                }
                ivm.this.bcc.oa(oib.uef(th), dzVar);
                ivm.this.ivm.remove(yoVar);
            }
        });
        return new uef(false, oib.uef());
    }

    private Object uef(String str, oa oaVar) throws JSONException {
        return this.uef.uef(str, uef(oaVar)[0]);
    }

    private static Type[] uef(Object obj) {
        Type genericSuperclass = obj.getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            return ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        }
        throw new IllegalStateException("Method is not parameterized?!");
    }
}
