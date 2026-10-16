package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class ahkr {
    public static final ahop<ahim, Integer> packageFqName = ahoq.newSingularGeneratedExtension(ahim.getDefaultInstance(), 0, null, null, 151, ahqi.INT32, Integer.class);
    public static final ahop<ahhc, List<ahgx>> classAnnotation = ahoq.newRepeatedGeneratedExtension(ahhc.getDefaultInstance(), ahgx.getDefaultInstance(), null, 150, ahqi.MESSAGE, false, ahgx.class);
    public static final ahop<ahhi, List<ahgx>> constructorAnnotation = ahoq.newRepeatedGeneratedExtension(ahhi.getDefaultInstance(), ahgx.getDefaultInstance(), null, 150, ahqi.MESSAGE, false, ahgx.class);
    public static final ahop<ahif, List<ahgx>> functionAnnotation = ahoq.newRepeatedGeneratedExtension(ahif.getDefaultInstance(), ahgx.getDefaultInstance(), null, 150, ahqi.MESSAGE, false, ahgx.class);
    public static final ahop<ahis, List<ahgx>> propertyAnnotation = ahoq.newRepeatedGeneratedExtension(ahis.getDefaultInstance(), ahgx.getDefaultInstance(), null, 150, ahqi.MESSAGE, false, ahgx.class);
    public static final ahop<ahis, List<ahgx>> propertyGetterAnnotation = ahoq.newRepeatedGeneratedExtension(ahis.getDefaultInstance(), ahgx.getDefaultInstance(), null, 152, ahqi.MESSAGE, false, ahgx.class);
    public static final ahop<ahis, List<ahgx>> propertySetterAnnotation = ahoq.newRepeatedGeneratedExtension(ahis.getDefaultInstance(), ahgx.getDefaultInstance(), null, 153, ahqi.MESSAGE, false, ahgx.class);
    public static final ahop<ahis, ahgu> compileTimeValue = ahoq.newSingularGeneratedExtension(ahis.getDefaultInstance(), ahgu.getDefaultInstance(), ahgu.getDefaultInstance(), null, 151, ahqi.MESSAGE, ahgu.class);
    public static final ahop<ahhx, List<ahgx>> enumEntryAnnotation = ahoq.newRepeatedGeneratedExtension(ahhx.getDefaultInstance(), ahgx.getDefaultInstance(), null, 150, ahqi.MESSAGE, false, ahgx.class);
    public static final ahop<ahkb, List<ahgx>> parameterAnnotation = ahoq.newRepeatedGeneratedExtension(ahkb.getDefaultInstance(), ahgx.getDefaultInstance(), null, 150, ahqi.MESSAGE, false, ahgx.class);
    public static final ahop<ahjn, List<ahgx>> typeAnnotation = ahoq.newRepeatedGeneratedExtension(ahjn.getDefaultInstance(), ahgx.getDefaultInstance(), null, 150, ahqi.MESSAGE, false, ahgx.class);
    public static final ahop<ahjv, List<ahgx>> typeParameterAnnotation = ahoq.newRepeatedGeneratedExtension(ahjv.getDefaultInstance(), ahgx.getDefaultInstance(), null, 150, ahqi.MESSAGE, false, ahgx.class);

    private ahkr() {
    }

    public static void registerAllExtensions(ahog ahogVar) {
        ahogVar.add(packageFqName);
        ahogVar.add(classAnnotation);
        ahogVar.add(constructorAnnotation);
        ahogVar.add(functionAnnotation);
        ahogVar.add(propertyAnnotation);
        ahogVar.add(propertyGetterAnnotation);
        ahogVar.add(propertySetterAnnotation);
        ahogVar.add(compileTimeValue);
        ahogVar.add(enumEntryAnnotation);
        ahogVar.add(parameterAnnotation);
        ahogVar.add(typeAnnotation);
        ahogVar.add(typeParameterAnnotation);
    }
}
