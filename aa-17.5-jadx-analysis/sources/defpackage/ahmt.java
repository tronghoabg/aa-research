package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahmt {
    public static final ahmt INSTANCE = new ahmt();
    private static final ahog EXTENSION_REGISTRY = ahgl.ExtensionRegistryLite(ahms.INSTANCE);

    private ahmt() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak EXTENSION_REGISTRY$lambda$0(ahog ahogVar) {
        ahogVar.getClass();
        ahmh.registerAllExtensions(ahogVar);
        ahko.registerAllExtensions(ahogVar);
        return afak.a;
    }

    public static final boolean isMovedFromInterfaceCompanion(ahis ahisVar) {
        ahisVar.getClass();
        ahkx is_moved_from_interface_companion = ahmk.INSTANCE.getIS_MOVED_FROM_INTERFACE_COMPANION();
        Object extension = ahisVar.getExtension(ahmh.flags);
        extension.getClass();
        return is_moved_from_interface_companion.get(((Number) extension).intValue()).booleanValue();
    }

    private final String mapTypeDefault(ahjn ahjnVar, ahld ahldVar) {
        if (ahjnVar.hasClassName()) {
            return ahmj.mapClass(ahldVar.getQualifiedClassName(ahjnVar.getClassName()));
        }
        return null;
    }

    public static final aezu<ahmo, ahhc> readClassDataFrom(byte[] bArr, String[] strArr) {
        bArr.getClass();
        strArr.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new aezu<>(INSTANCE.readNameResolver(byteArrayInputStream, strArr), ahhc.parseFrom(byteArrayInputStream, EXTENSION_REGISTRY));
    }

    public static final aezu<ahmo, ahif> readFunctionDataFrom(String[] strArr, String[] strArr2) {
        strArr.getClass();
        strArr2.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(ahmi.decodeBytes(strArr));
        return new aezu<>(INSTANCE.readNameResolver(byteArrayInputStream, strArr2), ahif.parseFrom(byteArrayInputStream, EXTENSION_REGISTRY));
    }

    private final ahmo readNameResolver(InputStream inputStream, String[] strArr) throws IOException {
        ahmg delimitedFrom = ahmg.parseDelimitedFrom(inputStream, EXTENSION_REGISTRY);
        delimitedFrom.getClass();
        return new ahmo(delimitedFrom, strArr);
    }

    public static final aezu<ahmo, ahim> readPackageDataFrom(byte[] bArr, String[] strArr) {
        bArr.getClass();
        strArr.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new aezu<>(INSTANCE.readNameResolver(byteArrayInputStream, strArr), ahim.parseFrom(byteArrayInputStream, EXTENSION_REGISTRY));
    }

    public final ahog getEXTENSION_REGISTRY() {
        return EXTENSION_REGISTRY;
    }

    public final ahmm getJvmConstructorSignature(ahhi ahhiVar, ahld ahldVar, ahlh ahlhVar) throws IOException {
        String strCu;
        ahhiVar.getClass();
        ahldVar.getClass();
        ahlhVar.getClass();
        ahop<ahhi, ahlv> ahopVar = ahmh.constructorSignature;
        ahopVar.getClass();
        ahlv ahlvVar = (ahlv) ahlf.getExtensionOrNull(ahhiVar, ahopVar);
        String string = (ahlvVar == null || !ahlvVar.hasName()) ? "<init>" : ahldVar.getString(ahlvVar.getName());
        if (ahlvVar == null || !ahlvVar.hasDesc()) {
            List<ahkb> valueParameterList = ahhiVar.getValueParameterList();
            valueParameterList.getClass();
            ArrayList arrayList = new ArrayList(woy.bp(valueParameterList, 10));
            for (ahkb ahkbVar : valueParameterList) {
                ahmt ahmtVar = INSTANCE;
                ahkbVar.getClass();
                String strMapTypeDefault = ahmtVar.mapTypeDefault(ahlg.type(ahkbVar, ahlhVar), ahldVar);
                if (strMapTypeDefault == null) {
                    return null;
                }
                arrayList.add(strMapTypeDefault);
            }
            strCu = woy.cu(arrayList, "", "(", ")V", null, 56);
        } else {
            strCu = ahldVar.getString(ahlvVar.getDesc());
        }
        return new ahmm(string, strCu);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v1 java.lang.String, still in use, count: 2, list:
          (r3v1 java.lang.String) from 0x0052: IF  (r3v1 java.lang.String) == (null java.lang.String)  -> B:22:0x0054 A[HIDDEN] (LINE:83)
          (r3v1 java.lang.String) from 0x0055: PHI (r3v2 java.lang.String) = (r3v1 java.lang.String), (r3v4 java.lang.String) binds: [B:21:0x0052, B:19:0x0041] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final defpackage.ahml getJvmFieldSignature(defpackage.ahis r4, defpackage.ahld r5, defpackage.ahlh r6, boolean r7) {
        /*
            r3 = this;
            r4.getClass()
            r5.getClass()
            r6.getClass()
            ahop<ahis, ahly> r0 = defpackage.ahmh.propertySignature
            r0.getClass()
            java.lang.Object r0 = defpackage.ahlf.getExtensionOrNull(r4, r0)
            ahly r0 = (defpackage.ahly) r0
            r1 = 0
            if (r0 != 0) goto L18
            goto L54
        L18:
            boolean r2 = r0.hasField()
            if (r2 == 0) goto L23
            ahls r0 = r0.getField()
            goto L24
        L23:
            r0 = r1
        L24:
            if (r0 != 0) goto L28
            if (r7 != 0) goto L54
        L28:
            if (r0 == 0) goto L35
            boolean r7 = r0.hasName()
            if (r7 == 0) goto L35
            int r7 = r0.getName()
            goto L39
        L35:
            int r7 = r4.getName()
        L39:
            if (r0 == 0) goto L4a
            boolean r2 = r0.hasDesc()
            if (r2 == 0) goto L4a
            int r3 = r0.getDesc()
            java.lang.String r3 = r5.getString(r3)
            goto L55
        L4a:
            ahjn r4 = defpackage.ahlg.returnType(r4, r6)
            java.lang.String r3 = r3.mapTypeDefault(r4, r5)
            if (r3 != 0) goto L55
        L54:
            return r1
        L55:
            ahml r4 = new ahml
            java.lang.String r5 = r5.getString(r7)
            r4.<init>(r5, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahmt.getJvmFieldSignature(ahis, ahld, ahlh, boolean):ahml");
    }

    public final ahmm getJvmMethodSignature(ahif ahifVar, ahld ahldVar, ahlh ahlhVar) {
        String strConcat;
        ahifVar.getClass();
        ahldVar.getClass();
        ahlhVar.getClass();
        ahop<ahif, ahlv> ahopVar = ahmh.methodSignature;
        ahopVar.getClass();
        ahlv ahlvVar = (ahlv) ahlf.getExtensionOrNull(ahifVar, ahopVar);
        int name = (ahlvVar == null || !ahlvVar.hasName()) ? ahifVar.getName() : ahlvVar.getName();
        if (ahlvVar == null || !ahlvVar.hasDesc()) {
            List listBj = woy.bj(ahlg.receiverType(ahifVar, ahlhVar));
            List<ahkb> valueParameterList = ahifVar.getValueParameterList();
            valueParameterList.getClass();
            ArrayList arrayList = new ArrayList(woy.bp(valueParameterList, 10));
            for (ahkb ahkbVar : valueParameterList) {
                ahkbVar.getClass();
                arrayList.add(ahlg.type(ahkbVar, ahlhVar));
            }
            List listBY = woy.bY(listBj, arrayList);
            ArrayList arrayList2 = new ArrayList(woy.bp(listBY, 10));
            Iterator it = listBY.iterator();
            while (it.hasNext()) {
                String strMapTypeDefault = INSTANCE.mapTypeDefault((ahjn) it.next(), ahldVar);
                if (strMapTypeDefault == null) {
                    return null;
                }
                arrayList2.add(strMapTypeDefault);
            }
            String strMapTypeDefault2 = mapTypeDefault(ahlg.returnType(ahifVar, ahlhVar), ahldVar);
            if (strMapTypeDefault2 == null) {
                return null;
            }
            strConcat = woy.cu(arrayList2, "", "(", ")", null, 56).concat(strMapTypeDefault2);
        } else {
            strConcat = ahldVar.getString(ahlvVar.getDesc());
        }
        return new ahmm(ahldVar.getString(name), strConcat);
    }

    public static final aezu<ahmo, ahhc> readClassDataFrom(String[] strArr, String[] strArr2) {
        strArr.getClass();
        strArr2.getClass();
        return readClassDataFrom(ahmi.decodeBytes(strArr), strArr2);
    }

    public static final aezu<ahmo, ahim> readPackageDataFrom(String[] strArr, String[] strArr2) {
        strArr.getClass();
        strArr2.getClass();
        return readPackageDataFrom(ahmi.decodeBytes(strArr), strArr2);
    }
}
