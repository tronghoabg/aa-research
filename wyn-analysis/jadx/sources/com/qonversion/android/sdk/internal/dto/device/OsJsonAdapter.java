package com.qonversion.android.sdk.internal.dto.device;

import cb.AbstractC1593a;
import com.unity3d.ads.metadata.MediationMetaData;
import ff.x;
import hb.AbstractC2797C;
import hb.K;
import hb.r;
import hb.u;
import hb.w;
import ib.f;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/device/OsJsonAdapter;", "Lhb/r;", "Lcom/qonversion/android/sdk/internal/dto/device/Os;", "Lhb/K;", "moshi", "<init>", "(Lhb/K;)V", "", "toString", "()Ljava/lang/String;", "Lhb/w;", "reader", "fromJson", "(Lhb/w;)Lcom/qonversion/android/sdk/internal/dto/device/Os;", "Lhb/C;", "writer", "value_", "Lef/C;", "toJson", "(Lhb/C;Lcom/qonversion/android/sdk/internal/dto/device/Os;)V", "Lhb/u;", "options", "Lhb/u;", "stringAdapter", "Lhb/r;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OsJsonAdapter extends r {

    @Nullable
    private volatile Constructor<Os> constructorRef;

    @NotNull
    private final u options;

    @NotNull
    private final r stringAdapter;

    public OsJsonAdapter(@NotNull K moshi) {
        AbstractC3340k.e(moshi, "moshi");
        this.options = u.a(MediationMetaData.KEY_NAME, "version");
        this.stringAdapter = moshi.c(String.class, x.f35434a, MediationMetaData.KEY_NAME);
    }

    @NotNull
    public String toString() {
        return AbstractC1593a.g(24, "GeneratedJsonAdapter(Os)", "toString(...)");
    }

    @Override // hb.r
    @NotNull
    public Os fromJson(@NotNull w reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        AbstractC3340k.e(reader, "reader");
        reader.b();
        String str = null;
        String str2 = null;
        int i5 = -1;
        while (reader.o()) {
            int iW = reader.W(this.options);
            if (iW == -1) {
                reader.Y();
                reader.Z();
            } else if (iW == 0) {
                str = (String) this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw f.l(MediationMetaData.KEY_NAME, MediationMetaData.KEY_NAME, reader);
                }
                i5 &= -2;
            } else if (iW == 1) {
                str2 = (String) this.stringAdapter.fromJson(reader);
                if (str2 == null) {
                    throw f.l("version", "version", reader);
                }
                i5 &= -3;
            } else {
                continue;
            }
        }
        reader.h();
        if (i5 == -4) {
            AbstractC3340k.c(str, "null cannot be cast to non-null type kotlin.String");
            AbstractC3340k.c(str2, "null cannot be cast to non-null type kotlin.String");
            return new Os(str, str2);
        }
        Constructor<Os> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = Os.class.getDeclaredConstructor(String.class, String.class, Integer.TYPE, f.f36941c);
            this.constructorRef = declaredConstructor;
            AbstractC3340k.d(declaredConstructor, "also(...)");
        }
        Os osNewInstance = declaredConstructor.newInstance(str, str2, Integer.valueOf(i5), null);
        AbstractC3340k.d(osNewInstance, "newInstance(...)");
        return osNewInstance;
    }

    @Override // hb.r
    public void toJson(@NotNull AbstractC2797C writer, @Nullable Os value_) {
        AbstractC3340k.e(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.w(MediationMetaData.KEY_NAME);
        this.stringAdapter.toJson(writer, value_.getName());
        writer.w("version");
        this.stringAdapter.toJson(writer, value_.getVersion());
        writer.i();
    }
}
