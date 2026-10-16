package com.qonversion.android.sdk.internal.dto;

import cb.AbstractC1593a;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import ff.x;
import hb.AbstractC2797C;
import hb.K;
import hb.r;
import hb.u;
import hb.w;
import ib.f;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/DataJsonAdapter;", "T", "Lhb/r;", "Lcom/qonversion/android/sdk/internal/dto/Data;", "Lhb/K;", "moshi", "", "Ljava/lang/reflect/Type;", "types", "<init>", "(Lhb/K;[Ljava/lang/reflect/Type;)V", "", "toString", "()Ljava/lang/String;", "Lhb/w;", "reader", "fromJson", "(Lhb/w;)Lcom/qonversion/android/sdk/internal/dto/Data;", "Lhb/C;", "writer", "value_", "Lef/C;", "toJson", "(Lhb/C;Lcom/qonversion/android/sdk/internal/dto/Data;)V", "Lhb/u;", "options", "Lhb/u;", "tNullableAnyAdapter", "Lhb/r;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DataJsonAdapter<T> extends r {

    @NotNull
    private final u options;

    @NotNull
    private final r tNullableAnyAdapter;

    public DataJsonAdapter(@NotNull K moshi, @NotNull Type[] types) {
        AbstractC3340k.e(moshi, "moshi");
        AbstractC3340k.e(types, "types");
        if (types.length == 1) {
            this.options = u.a(JsonStorageKeyNames.DATA_KEY);
            this.tNullableAnyAdapter = moshi.c(types[0], x.f35434a, JsonStorageKeyNames.DATA_KEY);
        } else {
            String str = "TypeVariable mismatch: Expecting 1 type for generic type variables [T], but received " + types.length;
            AbstractC3340k.d(str, "toString(...)");
            throw new IllegalArgumentException(str.toString());
        }
    }

    @NotNull
    public String toString() {
        return AbstractC1593a.g(26, "GeneratedJsonAdapter(Data)", "toString(...)");
    }

    @Override // hb.r
    @NotNull
    public Data<T> fromJson(@NotNull w reader) {
        AbstractC3340k.e(reader, "reader");
        reader.b();
        Object objFromJson = null;
        while (reader.o()) {
            int iW = reader.W(this.options);
            if (iW == -1) {
                reader.Y();
                reader.Z();
            } else if (iW == 0 && (objFromJson = this.tNullableAnyAdapter.fromJson(reader)) == null) {
                throw f.l("data_", JsonStorageKeyNames.DATA_KEY, reader);
            }
        }
        reader.h();
        if (objFromJson != null) {
            return new Data<>(objFromJson);
        }
        throw f.f("data_", JsonStorageKeyNames.DATA_KEY, reader);
    }

    @Override // hb.r
    public void toJson(@NotNull AbstractC2797C writer, @Nullable Data<T> value_) {
        AbstractC3340k.e(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.w(JsonStorageKeyNames.DATA_KEY);
        this.tNullableAnyAdapter.toJson(writer, value_.getData());
        writer.i();
    }
}
