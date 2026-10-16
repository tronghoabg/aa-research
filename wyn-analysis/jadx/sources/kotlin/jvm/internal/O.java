package kotlin.jvm.internal;

import java.util.List;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;

/* loaded from: classes5.dex */
public final class O implements KType {

    /* renamed from: a, reason: collision with root package name */
    public final KClassifier f39750a;

    /* renamed from: b, reason: collision with root package name */
    public final List f39751b;

    /* renamed from: c, reason: collision with root package name */
    public final int f39752c;

    public O(KClassifier classifier, List arguments, int i5) {
        AbstractC3340k.e(classifier, "classifier");
        AbstractC3340k.e(arguments, "arguments");
        this.f39750a = classifier;
        this.f39751b = arguments;
        this.f39752c = i5;
    }

    public final String a(boolean z2) {
        KClassifier kClassifier = this.f39750a;
        KClass kClass = kClassifier instanceof KClass ? (KClass) kClassifier : null;
        Class clsY = kClass != null ? Fe.b.y(kClass) : null;
        String string = clsY == null ? kClassifier.toString() : (this.f39752c & 4) != 0 ? "kotlin.Nothing" : clsY.isArray() ? clsY.equals(boolean[].class) ? "kotlin.BooleanArray" : clsY.equals(char[].class) ? "kotlin.CharArray" : clsY.equals(byte[].class) ? "kotlin.ByteArray" : clsY.equals(short[].class) ? "kotlin.ShortArray" : clsY.equals(int[].class) ? "kotlin.IntArray" : clsY.equals(float[].class) ? "kotlin.FloatArray" : clsY.equals(long[].class) ? "kotlin.LongArray" : clsY.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array" : (z2 && clsY.isPrimitive()) ? Fe.b.z((KClass) kClassifier).getName() : clsY.getName();
        List list = this.f39751b;
        return N0.a.g(string, list.isEmpty() ? "" : ff.o.w0(list, ", ", "<", ">", new Af.r(this, 29), 24), isMarkedNullable() ? "?" : "");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof O)) {
            return false;
        }
        O o7 = (O) obj;
        return AbstractC3340k.a(this.f39750a, o7.f39750a) && AbstractC3340k.a(this.f39751b, o7.f39751b) && this.f39752c == o7.f39752c;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final List getAnnotations() {
        return ff.v.f35432a;
    }

    @Override // kotlin.reflect.KType
    public final List getArguments() {
        return this.f39751b;
    }

    @Override // kotlin.reflect.KType
    public final KClassifier getClassifier() {
        return this.f39750a;
    }

    public final int hashCode() {
        return ((this.f39751b.hashCode() + (this.f39750a.hashCode() * 31)) * 31) + this.f39752c;
    }

    @Override // kotlin.reflect.KType
    public final boolean isMarkedNullable() {
        return (this.f39752c & 1) != 0;
    }

    public final String toString() {
        return a(false) + " (Kotlin reflection is not available)";
    }
}
