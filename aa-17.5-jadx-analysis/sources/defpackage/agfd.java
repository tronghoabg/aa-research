package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final class agfd implements agfc {
    private final aigl annotationType;
    private final agdx source;
    private final Map<ahnj, ahuh<?>> valueArguments;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = "source";
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 3 && i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public agfd(aigl aiglVar, Map<ahnj, ahuh<?>> map, agdx agdxVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(0);
        }
        if (map == null) {
            $$$reportNull$$$0(1);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(2);
        }
        this.annotationType = aiglVar;
        this.valueArguments = map;
        this.source = agdxVar;
    }

    @Override // defpackage.agfc
    public Map<ahnj, ahuh<?>> getAllValueArguments() {
        Map<ahnj, ahuh<?>> map = this.valueArguments;
        if (map == null) {
            $$$reportNull$$$0(4);
        }
        return map;
    }

    @Override // defpackage.agfc
    public ahnf getFqName() {
        return agfb.getFqName(this);
    }

    @Override // defpackage.agfc
    public agdx getSource() {
        agdx agdxVar = this.source;
        if (agdxVar == null) {
            $$$reportNull$$$0(5);
        }
        return agdxVar;
    }

    @Override // defpackage.agfc
    public aigl getType() {
        aigl aiglVar = this.annotationType;
        if (aiglVar == null) {
            $$$reportNull$$$0(3);
        }
        return aiglVar;
    }

    public String toString() {
        return ahre.FQ_NAMES_IN_TYPES.renderAnnotation(this, null);
    }
}
