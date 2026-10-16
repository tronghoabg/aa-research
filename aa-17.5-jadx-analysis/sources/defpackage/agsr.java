package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class agsr {
    private static final List<agrv> APPLICABILITY_OF_JAVAX_DEFAULTS;
    private static final List<agrv> APPLICABILITY_OF_JSPECIFY_DEFAULTS;
    private static final Map<ahnf, agsq> BUILT_IN_TYPE_QUALIFIER_DEFAULT_ANNOTATIONS;
    private static final Map<ahnf, agsq> JAVAX_DEFAULT_ANNOTATIONS;
    private static final Map<ahnf, agsq> JSPECIFY_DEFAULT_ANNOTATIONS;

    static {
        boolean z = false;
        int i = 2;
        List<agrv> listBi = woy.bi(agrv.FIELD, agrv.METHOD_RETURN_TYPE, agrv.VALUE_PARAMETER, agrv.TYPE_PARAMETER_BOUNDS, agrv.TYPE_USE);
        APPLICABILITY_OF_JSPECIFY_DEFAULTS = listBi;
        List<agrv> listBg = woy.bg(agrv.VALUE_PARAMETER);
        APPLICABILITY_OF_JAVAX_DEFAULTS = listBg;
        afeu afeuVar = null;
        Map<ahnf, agsq> mapBa = woy.ba(new aezu(agtj.getJSPECIFY_OLD_NULL_MARKED_ANNOTATION_FQ_NAME(), new agsq(new ahdf(ahau.NOT_NULL, z, i, afeuVar), listBi, false, true, true)), new aezu(agtj.getJSPECIFY_NULL_MARKED_ANNOTATION_FQ_NAME(), new agsq(new ahdf(ahau.NOT_NULL, z, i, afeuVar), listBi, false, true, true)), new aezu(agtj.getJSPECIFY_NULL_UNMARKED_ANNOTATION_FQ_NAME(), new agsq(new ahdf(ahau.FORCE_FLEXIBILITY, z, i, afeuVar), listBi, false, true, true, 4, null)));
        JSPECIFY_DEFAULT_ANNOTATIONS = mapBa;
        ahnf javax_parameters_are_nonnull_by_default_annotation_fq_name = agtj.getJAVAX_PARAMETERS_ARE_NONNULL_BY_DEFAULT_ANNOTATION_FQ_NAME();
        ahdf ahdfVar = new ahdf(ahau.NOT_NULL, z, i, afeuVar);
        int i2 = 28;
        afeu afeuVar2 = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        Map<ahnf, agsq> mapBa2 = woy.ba(new aezu(javax_parameters_are_nonnull_by_default_annotation_fq_name, new agsq(ahdfVar, listBg, z2, z3, z4, i2, afeuVar2)), new aezu(agtj.getJAVAX_PARAMETERS_ARE_NULLABLE_BY_DEFAULT_ANNOTATION_FQ_NAME(), new agsq(new ahdf(ahau.NULLABLE, z, i, afeuVar), listBg, z2, z3, z4, i2, afeuVar2)));
        JAVAX_DEFAULT_ANNOTATIONS = mapBa2;
        BUILT_IN_TYPE_QUALIFIER_DEFAULT_ANNOTATIONS = woy.bb(mapBa, mapBa2);
    }

    public static final Map<ahnf, agsq> getBUILT_IN_TYPE_QUALIFIER_DEFAULT_ANNOTATIONS() {
        return BUILT_IN_TYPE_QUALIFIER_DEFAULT_ANNOTATIONS;
    }

    public static final Map<ahnf, agsq> getJSPECIFY_DEFAULT_ANNOTATIONS() {
        return JSPECIFY_DEFAULT_ANNOTATIONS;
    }
}
