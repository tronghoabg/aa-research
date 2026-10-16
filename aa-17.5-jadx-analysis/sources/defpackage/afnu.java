package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class afnu<R> extends afug<R> {
    private final afrj container;
    private final Member member;
    private final Object rawBoundReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afnu(afrj afrjVar, Member member, Object obj, afpq afpqVar) {
        super(afpqVar);
        afrjVar.getClass();
        member.getClass();
        afpqVar.getClass();
        this.container = afrjVar;
        this.member = member;
        this.rawBoundReceiver = obj;
    }

    @Override // defpackage.afhc
    public List<Annotation> getAnnotations() {
        Member memberMo61getMember = getCaller().mo61getMember();
        AnnotatedElement annotatedElement = memberMo61getMember instanceof AnnotatedElement ? (AnnotatedElement) memberMo61getMember : null;
        if (annotatedElement == null) {
            return afbe.a;
        }
        Annotation[] annotations = annotatedElement.getAnnotations();
        annotations.getClass();
        return afvu.unwrapKotlinRepeatableAnnotations(woy.df(annotations));
    }

    @Override // defpackage.afue
    public afrj getContainer() {
        return this.container;
    }

    public final Member getMember() {
        return this.member;
    }

    @Override // defpackage.afue
    public agox getModality() {
        agox modality = getOverriddenStorage().getModality();
        return modality == null ? (Modifier.isFinal(this.member.getModifiers()) || afjs.isEnumValuesValueOfMethod(this.member)) ? agox.FINAL : Modifier.isAbstract(this.member.getModifiers()) ? agox.ABSTRACT : agox.OPEN : modality;
    }

    @Override // defpackage.afue
    public Object getRawBoundReceiver() {
        return this.rawBoundReceiver;
    }

    @Override // defpackage.afhd
    public afif getVisibility() {
        return afjs.computeVisibilityForJavaModifiers(this.member.getModifiers());
    }

    @Override // defpackage.afue
    public final boolean isPackagePrivate() {
        return afvu.isPackagePrivate(this.member.getModifiers());
    }

    @Override // defpackage.afhd
    public final boolean isSuspend() {
        return false;
    }
}
