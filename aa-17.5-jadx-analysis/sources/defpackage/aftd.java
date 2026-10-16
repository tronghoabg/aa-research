package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class aftd<PropertyType, ReturnType> extends afry<ReturnType> implements afhh, afhs {
    public aftd() {
        super(afpq.EMPTY);
    }

    public abstract agok getAccessor();

    @Override // defpackage.afhc
    public List<Annotation> getAnnotations() {
        Annotation[] annotations;
        if (afuo.isLocalDelegated(getProperty())) {
            return afbe.a;
        }
        Member memberMo61getMember = getCaller().mo61getMember();
        List listDf = null;
        Method method = memberMo61getMember instanceof Method ? (Method) memberMo61getMember : null;
        if (method != null && (annotations = method.getAnnotations()) != null) {
            listDf = woy.df(annotations);
        }
        if (listDf == null) {
            listDf = afbe.a;
        }
        return afvu.unwrapKotlinRepeatableAnnotations(listDf);
    }

    @Override // defpackage.afue
    public afwf<?> getCallerWithDefaults() {
        return null;
    }

    @Override // defpackage.afue
    public afrj getContainer() {
        return getProperty().getContainer();
    }

    @Override // defpackage.afue
    public agox getModality() {
        agox modality;
        agok accessor = getAccessor();
        return (accessor == null || (modality = agmo.getModality(accessor)) == null) ? getProperty().getModality() : modality;
    }

    @Override // defpackage.afhs
    public abstract aftr<PropertyType> getProperty();

    @Override // defpackage.afue
    public Object getRawBoundReceiver() {
        return getProperty().getRawBoundReceiver();
    }

    @Override // defpackage.afhd
    public List<afic> getTypeParameters() {
        return getProperty().getTypeParameters();
    }

    @Override // defpackage.afhd
    public afif getVisibility() {
        agoz visibility;
        afif kVisibility;
        agok accessor = getAccessor();
        return (accessor == null || (visibility = agmo.getVisibility(accessor)) == null || (kVisibility = afjz.toKVisibility(visibility)) == null) ? getProperty().getVisibility() : kVisibility;
    }

    @Override // defpackage.afhh
    public boolean isExternal() {
        agok accessor = getAccessor();
        return accessor != null && agmo.isExternal(accessor);
    }

    @Override // defpackage.afhh
    public boolean isInfix() {
        return false;
    }

    @Override // defpackage.afhh
    public boolean isInline() {
        agok accessor = getAccessor();
        return accessor != null && agmo.isInline(accessor);
    }

    @Override // defpackage.afhh
    public boolean isOperator() {
        return false;
    }

    @Override // defpackage.afhd
    public boolean isSuspend() {
        return false;
    }

    @Override // defpackage.afue
    public final afue<ReturnType> shallowCopy(afrj afrjVar, afpq afpqVar) {
        afrjVar.getClass();
        afpqVar.getClass();
        throw new IllegalStateException("Property accessors can only be copied by copying the corresponding property");
    }
}
