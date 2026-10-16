package com.qonversion.android.sdk.internal.dto;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import hb.InterfaceC2812o;
import hb.s;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\b\b\u0001\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0003\u0010\u0003\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/Data;", "T", "", JsonStorageKeyNames.DATA_KEY, "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/qonversion/android/sdk/internal/dto/Data;", "equals", "", "other", "hashCode", "", "toString", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Data<T> {
    private final T data;

    public Data(@InterfaceC2812o(name = JsonStorageKeyNames.DATA_KEY) T t10) {
        this.data = t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Data copy$default(Data data, Object obj, int i5, Object obj2) {
        if ((i5 & 1) != 0) {
            obj = data.data;
        }
        return data.copy(obj);
    }

    public final T component1() {
        return this.data;
    }

    @NotNull
    public final Data<T> copy(@InterfaceC2812o(name = JsonStorageKeyNames.DATA_KEY) T data) {
        return new Data<>(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Data) && AbstractC3340k.a(this.data, ((Data) other).data);
    }

    public final T getData() {
        return this.data;
    }

    public int hashCode() {
        T t10 = this.data;
        if (t10 == null) {
            return 0;
        }
        return t10.hashCode();
    }

    @NotNull
    public String toString() {
        return "Data(data=" + this.data + ")";
    }
}
