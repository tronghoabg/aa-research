package kotlinx.b.d;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f51209a;

    /* renamed from: b, reason: collision with root package name */
    private final String f51210b;

    /* renamed from: c, reason: collision with root package name */
    private final String f51211c;

    /* renamed from: d, reason: collision with root package name */
    private final a f51212d;

    public h(boolean z, String str, a aVar) {
        h.g.b.x.f(str, "prettyPrintIndent");
        h.g.b.x.f(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "classDiscriminator");
        h.g.b.x.f(aVar, "classDiscriminatorMode");
        this.f51209a = z;
        this.f51210b = str;
        this.f51211c = ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY;
        this.f51212d = aVar;
    }

    public final String a() {
        return this.f51211c;
    }

    public final String b() {
        return this.f51210b;
    }

    public final a c() {
        return this.f51212d;
    }

    public final boolean d() {
        return this.f51209a;
    }

    public final String toString() {
        return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=false, isLenient=false, allowStructuredMapKeys=false, prettyPrint=" + this.f51209a + ", explicitNulls=true, prettyPrintIndent='" + this.f51210b + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + this.f51211c + "', allowSpecialFloatingPointValues=false, useAlternativeNames=true, namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + this.f51212d + ')';
    }
}
