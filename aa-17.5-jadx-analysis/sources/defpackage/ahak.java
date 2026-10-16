package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
final class ahak implements agfc {
    public static final ahak INSTANCE = new ahak();

    private ahak() {
    }

    private final Void throwError() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // defpackage.agfc
    public Map<ahnj, ahuh<?>> getAllValueArguments() {
        throwError();
        throw new aezp();
    }

    @Override // defpackage.agfc
    public /* bridge */ ahnf getFqName() {
        return agfb.getFqName(this);
    }

    @Override // defpackage.agfc
    public agdx getSource() {
        throwError();
        throw new aezp();
    }

    @Override // defpackage.agfc
    public aigl getType() {
        throwError();
        throw new aezp();
    }

    public String toString() {
        return "[EnhancedType]";
    }
}
