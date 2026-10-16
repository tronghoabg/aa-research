package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class yms extends ymc {
    public static final yhe b;
    private final yfy c;
    private final yfy d;
    private final int[] e;
    private final int[] f;

    static {
        int i = yfq.d;
        yfq yfqVar = yls.a;
        yly ylyVar = yly.a;
        b = new yms(yfqVar, ylyVar, ylyVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public yms(yfq yfqVar, ygr ygrVar, ygr ygrVar2) {
        yfy yfyVarG = yrm.G(ygrVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        yno it = ygrVar.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), new LinkedHashMap());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        yno it2 = ygrVar2.iterator();
        while (it2.hasNext()) {
            linkedHashMap2.put(it2.next(), new LinkedHashMap());
        }
        int[] iArr = new int[yfqVar.size()];
        int[] iArr2 = new int[yfqVar.size()];
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= yfqVar.size()) {
                break;
            }
            yni yniVar = (yni) yfqVar.get(i);
            Object objB = yniVar.b();
            Object objA = yniVar.a();
            Object objC = yniVar.c();
            Integer num = (Integer) yfyVarG.get(objB);
            num.getClass();
            iArr[i] = num.intValue();
            Map map = (Map) linkedHashMap.get(objB);
            map.getClass();
            iArr2[i] = map.size();
            Object objPut = map.put(objA, objC);
            if (objPut != null) {
                z = false;
            }
            woy.ah(z, objB, objA, objC, objPut);
            Map map2 = (Map) linkedHashMap2.get(objA);
            map2.getClass();
            map2.put(objB, objC);
            i++;
        }
        this.e = iArr;
        this.f = iArr2;
        yfu yfuVar = new yfu(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            yfuVar.e(entry.getKey(), yfy.j((Map) entry.getValue()));
        }
        this.c = yfuVar.d(true);
        yfu yfuVar2 = new yfu(linkedHashMap2.size());
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            yfuVar2.e(entry2.getKey(), yfy.j((Map) entry2.getValue()));
        }
        this.d = yfuVar2.d(true);
    }

    @Override // defpackage.ynj
    public final int f() {
        return this.e.length;
    }

    @Override // defpackage.yhe
    public final yfy g() {
        return yfy.j(this.d);
    }

    @Override // defpackage.yhe, defpackage.ynj
    /* renamed from: h */
    public final yfy k() {
        return yfy.j(this.c);
    }

    @Override // defpackage.ymc
    public final yni i(int i) {
        yfy yfyVar = this.c;
        Map.Entry entry = (Map.Entry) yfyVar.entrySet().d().get(this.e[i]);
        yfy yfyVar2 = (yfy) entry.getValue();
        Map.Entry entry2 = (Map.Entry) yfyVar2.entrySet().d().get(this.f[i]);
        return o(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ymc
    public final Object j(int i) {
        yfy yfyVar = this.c;
        yfy yfyVar2 = (yfy) ((yfq) yfyVar.values()).get(this.e[i]);
        return yfyVar2.values().d().get(this.f[i]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ymc, defpackage.yhe
    Object writeReplace() {
        yfy yfyVarG = yrm.G(m());
        int[] iArr = new int[l().size()];
        yno it = l().iterator();
        int i = 0;
        while (it.hasNext()) {
            Integer num = (Integer) yfyVarG.get(((yni) it.next()).a());
            num.getClass();
            iArr[i] = num.intValue();
            i++;
        }
        return yhd.a(this, this.e, iArr);
    }
}
