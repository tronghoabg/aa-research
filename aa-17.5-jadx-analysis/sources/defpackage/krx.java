package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.google.android.projection.gearhead.R;
import j$.util.Map;
import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class krx implements krv {
    private final int a;
    private final ksj b;
    private final krt c;
    private final Map d;

    public krx(int i, ksj ksjVar) {
        krt krtVar;
        this.a = i;
        this.b = ksjVar;
        if (acpc.a.gu().w()) {
            krt krtVar2 = new krt(new abzy(i));
            krt krtVar3 = kry.a.c;
            krtVar = new krt(krtVar2.a, krtVar2.b, krtVar2.c, krtVar3.d, krtVar3.e);
        } else {
            krtVar = new krt(new abzy(i));
        }
        this.c = krtVar;
        afby afbyVar = new afby(8);
        afao afaoVar = new afao((afar) krr.U);
        while (afaoVar.hasNext()) {
            f(afbyVar, krtVar, (ksk) ((krr) afaoVar.next()).V.invoke(ksjVar));
        }
        f(afbyVar, krtVar, krs.a);
        this.d = afbyVar.e();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void e(java.util.Map r58, java.lang.String r59, int r60, int r61) {
        /*
            Method dump skipped, instructions count: 3034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.krx.e(java.util.Map, java.lang.String, int, int):void");
    }

    private static final void f(Map map, krt krtVar, ksk kskVar) {
        ksd ksdVar = kskVar.b;
        String strA = ksdVar.a();
        abzz abzzVar = (abzz) ksdVar.j.invoke(krtVar);
        int i = kskVar.a;
        e(map, strA, i, abzzVar.a(i));
        ksd ksdVar2 = kskVar.d;
        String strA2 = ksdVar2.a();
        abzz abzzVar2 = (abzz) ksdVar2.j.invoke(krtVar);
        int i2 = kskVar.c;
        e(map, strA2, i2, abzzVar2.a(i2));
    }

    @Override // defpackage.krv
    public final Context a(Context context) {
        Context baseContext;
        Configuration configuration = context.getResources().getConfiguration();
        krw krwVar = context instanceof krw ? (krw) context : null;
        if (krwVar != null && (baseContext = krwVar.getBaseContext()) != null) {
            context = baseContext;
        }
        krw krwVar2 = new krw(context, R.style.ThemeOverlay_Palette_Dynamic);
        if (Build.VERSION.SDK_INT >= 30) {
            kru kruVar = ksa.a;
            int i = kru.b;
            tdh.a(krwVar2, bgl$$ExternalSyntheticApiModelOutline0.m206m(ksa.c.a()));
            krwVar2.a().updateConfiguration(configuration, krwVar2.a().getDisplayMetrics());
        }
        return krwVar2;
    }

    @Override // defpackage.krv
    public final krt b() {
        return this.c;
    }

    @Override // defpackage.krv
    public final void c() throws Exception {
        tdk tdkVar;
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        kru kruVar = ksa.a;
        int i = kru.b;
        ResourcesLoader resourcesLoaderM206m = bgl$$ExternalSyntheticApiModelOutline0.m206m(ksa.c.a());
        Context context = mki.a.c;
        context.getClass();
        Map map = this.d;
        yph yphVar = tdh.a;
        resourcesLoaderM206m.getClass();
        try {
            if (map.entrySet().isEmpty()) {
                throw new IllegalArgumentException("No color resources provided for harmonization.");
            }
            String packageName = context.getPackageName();
            packageName.getClass();
            tdk tdkVar2 = new tdk(127, packageName);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            tdi tdiVar = null;
            for (Map.Entry entry : map.entrySet()) {
                int iIntValue = ((Number) entry.getKey()).intValue();
                int iIntValue2 = ((Number) entry.getValue()).intValue();
                String resourceEntryName = context.getResources().getResourceEntryName(iIntValue);
                resourceEntryName.getClass();
                tdi tdiVar2 = new tdi(iIntValue, resourceEntryName, iIntValue2);
                if (!affa.f(context.getResources().getResourceTypeName(iIntValue), "color")) {
                    String str = tdiVar2.a;
                    String string = Integer.toString(tdiVar2.d & 255, 16);
                    string.getClass();
                    throw new IllegalArgumentException("Non color resource found: name=" + str + ", typeId=" + string);
                }
                byte b = tdiVar2.c;
                if (b == 1) {
                    tdkVar = tdq.b;
                } else {
                    if (b != 127) {
                        throw new IllegalArgumentException("Not supported with unknown package id: ".concat(String.valueOf(String.valueOf(b & 255))));
                    }
                    tdkVar = tdkVar2;
                }
                ((List) Map.EL.computeIfAbsent(linkedHashMap, tdkVar, new ixx(new aitt(1), 6))).add(tdiVar2);
                tdiVar = tdiVar2;
            }
            byte b2 = tdiVar != null ? tdiVar.d : (byte) 0;
            tdq.a = b2;
            if (b2 == 0) {
                throw new IllegalArgumentException("No color resources found for harmonization.");
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            tdn tdnVar = new tdn(linkedHashMap);
            tdnVar.d.a(byteArrayOutputStream);
            byteArrayOutputStream.write(a.T(tdnVar.a));
            tdnVar.b.a(byteArrayOutputStream);
            for (tdj tdjVar : tdnVar.c) {
                tdjVar.f.a(byteArrayOutputStream);
                tdk tdkVar3 = tdjVar.a;
                byteArrayOutputStream.write(a.T(tdkVar3.a));
                char[] charArray = tdkVar3.b.toCharArray();
                charArray.getClass();
                for (int i2 = 0; i2 < 128; i2++) {
                    if (i2 < charArray.length) {
                        byteArrayOutputStream.write(spu.aV(charArray[i2]));
                    } else {
                        byteArrayOutputStream.write(spu.aV((char) 0));
                    }
                }
                byteArrayOutputStream.write(a.T(288));
                byteArrayOutputStream.write(a.T(0));
                tdo tdoVar = tdjVar.b;
                byteArrayOutputStream.write(a.T(tdoVar.a + 288));
                byteArrayOutputStream.write(a.T(0));
                byteArrayOutputStream.write(a.T(0));
                tdoVar.a(byteArrayOutputStream);
                tdjVar.c.a(byteArrayOutputStream);
                tdp tdpVar = tdjVar.d;
                tdpVar.b.a(byteArrayOutputStream);
                byteArrayOutputStream.write(new byte[]{tdq.a, 0, 0, 0});
                byteArrayOutputStream.write(a.T(tdpVar.a));
                Object obj = tdpVar.e;
                int length = ((int[]) obj).length;
                for (int i3 = 0; i3 < length; i3++) {
                    byteArrayOutputStream.write(a.T(((int[]) obj)[i3]));
                }
                Object obj2 = tdpVar.f;
                ((tdp) obj2).b.a(byteArrayOutputStream);
                byteArrayOutputStream.write(new byte[]{tdq.a, 0, 0, 0});
                byteArrayOutputStream.write(a.T(((tdp) obj2).c));
                byteArrayOutputStream.write(a.T(((tdp) obj2).a));
                byteArrayOutputStream.write((byte[]) ((tdp) obj2).f);
                Object obj3 = ((tdp) obj2).d;
                int length2 = ((int[]) obj3).length;
                for (int i4 = 0; i4 < length2; i4++) {
                    byteArrayOutputStream.write(a.T(((int[]) obj3)[i4]));
                }
                Object obj4 = ((tdp) obj2).e;
                int length3 = ((tdm[]) obj4).length;
                for (int i5 = 0; i5 < length3; i5++) {
                    tdm tdmVar = ((tdm[]) obj4)[i5];
                    byteArrayOutputStream.write(spu.aW((short) 8));
                    byteArrayOutputStream.write(spu.aW((short) 2));
                    byteArrayOutputStream.write(a.T(tdmVar.a));
                    byteArrayOutputStream.write(spu.aW((short) 8));
                    byteArrayOutputStream.write(new byte[]{0, 28});
                    byteArrayOutputStream.write(a.T(tdmVar.b));
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArray.getClass();
            ype ypeVar = (ype) tdh.a.f();
            int length4 = byteArray.length;
            ypeVar.w("Table created, length: %d", length4);
            if (length4 == 0) {
                return;
            }
            tdr tdrVar = new tdr();
            try {
                FileDescriptor fileDescriptor = tdrVar.a;
                FileOutputStream fileOutputStream = new FileOutputStream(fileDescriptor);
                try {
                    fileOutputStream.write(byteArray);
                    ParcelFileDescriptor parcelFileDescriptorDup = ParcelFileDescriptor.dup(fileDescriptor);
                    try {
                        List listSingletonList = Collections.singletonList(ResourcesProvider.loadFromTable(parcelFileDescriptorDup, null));
                        listSingletonList.getClass();
                        resourcesLoaderM206m.setProviders(listSingletonList);
                        affa.n(parcelFileDescriptorDup, null);
                        fileOutputStream.close();
                        tdrVar.close();
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (Exception e) {
            ((ype) ((ype) tdh.a.g()).p(e)).u("Failed to create the ColorResourcesTableCreator.");
        }
    }

    @Override // defpackage.krv
    public final void d(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        context.getTheme().applyStyle(R.style.ThemeOverlay_Palette_Dynamic, true);
        if (Build.VERSION.SDK_INT >= 30) {
            kru kruVar = ksa.a;
            int i = kru.b;
            tdh.a(context, bgl$$ExternalSyntheticApiModelOutline0.m206m(ksa.c.a()));
            context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krx)) {
            return false;
        }
        krx krxVar = (krx) obj;
        return this.a == krxVar.a && affa.f(this.b, krxVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) - 1694296688;
    }

    public final String toString() {
        return "RuntimePalette(baseColor=" + this.a + ", themeVersion=" + this.b + ")";
    }
}
