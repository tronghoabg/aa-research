package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class afoz {
    /* JADX INFO: Access modifiers changed from: private */
    public static final afwf<?> computeCallerForAccessor(afop<?, ?> afopVar, boolean z) {
        Field jField = afopVar.getProperty().getJField();
        return !Modifier.isStatic(jField.getModifiers()) ? z ? afuh.isBound(afopVar) ? new afwl(jField, getBoundReceiver(afopVar)) : new afwn(jField) : afuh.isBound(afopVar) ? new afwr(jField, false, getBoundReceiver(afopVar)) : new afwt(jField, false) : z ? new afwp(jField) : new afwv(jField, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<afhr> computeParameters(afoy<?> afoyVar, boolean z) {
        if (Modifier.isStatic(afoyVar.getJField().getModifiers())) {
            return afbe.a;
        }
        Field jField = afoyVar.getJField();
        Objects.toString(jField);
        throw new IllegalArgumentException("Only static properties are supported for now: ".concat(jField.toString()));
    }

    public static final Object getBoundReceiver(afop<?, ?> afopVar) {
        afopVar.getClass();
        return afuh.getBoundReceiver(afopVar.getProperty());
    }
}
