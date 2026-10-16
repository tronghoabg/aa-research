package Wf;

import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;

/* loaded from: classes5.dex */
public final class K implements KType {

    /* renamed from: a, reason: collision with root package name */
    public final KType f15551a;

    public K(KType origin) {
        AbstractC3340k.e(origin, "origin");
        this.f15551a = origin;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        K k = obj instanceof K ? (K) obj : null;
        KType kType = k != null ? k.f15551a : null;
        KType kType2 = this.f15551a;
        if (!AbstractC3340k.a(kType2, kType)) {
            return false;
        }
        KClassifier classifier = kType2.getClassifier();
        if (classifier instanceof KClass) {
            KType kType3 = obj instanceof KType ? (KType) obj : null;
            KClassifier classifier2 = kType3 != null ? kType3.getClassifier() : null;
            if (classifier2 != null && (classifier2 instanceof KClass)) {
                return Fe.b.y((KClass) classifier).equals(Fe.b.y((KClass) classifier2));
            }
        }
        return false;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final List getAnnotations() {
        return this.f15551a.getAnnotations();
    }

    @Override // kotlin.reflect.KType
    public final List getArguments() {
        return this.f15551a.getArguments();
    }

    @Override // kotlin.reflect.KType
    public final KClassifier getClassifier() {
        return this.f15551a.getClassifier();
    }

    public final int hashCode() {
        return this.f15551a.hashCode();
    }

    @Override // kotlin.reflect.KType
    public final boolean isMarkedNullable() {
        return this.f15551a.isMarkedNullable();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.f15551a;
    }
}
