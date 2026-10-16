package com.qonversion.android.sdk.internal.dto;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import hb.InterfaceC2812o;
import hb.s;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00028\u0000¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\u000e\u0010\r\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\bJ(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/BaseResponse;", "T", "", "success", "", JsonStorageKeyNames.DATA_KEY, "(ZLjava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSuccess", "()Z", "component1", "component2", "copy", "(ZLjava/lang/Object;)Lcom/qonversion/android/sdk/internal/dto/BaseResponse;", "equals", "other", "hashCode", "", "toString", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BaseResponse<T> {
    private final T data;
    private final boolean success;

    public BaseResponse(@InterfaceC2812o(name = "success") boolean z2, @InterfaceC2812o(name = JsonStorageKeyNames.DATA_KEY) T t10) {
        this.success = z2;
        this.data = t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BaseResponse copy$default(BaseResponse baseResponse, boolean z2, Object obj, int i5, Object obj2) {
        if ((i5 & 1) != 0) {
            z2 = baseResponse.success;
        }
        if ((i5 & 2) != 0) {
            obj = baseResponse.data;
        }
        return baseResponse.copy(z2, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public final T component2() {
        return this.data;
    }

    @NotNull
    public final BaseResponse<T> copy(@InterfaceC2812o(name = "success") boolean success, @InterfaceC2812o(name = JsonStorageKeyNames.DATA_KEY) T data) {
        return new BaseResponse<>(success, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseResponse)) {
            return false;
        }
        BaseResponse baseResponse = (BaseResponse) other;
        return this.success == baseResponse.success && AbstractC3340k.a(this.data, baseResponse.data);
    }

    public final T getData() {
        return this.data;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int i5 = (this.success ? 1231 : 1237) * 31;
        T t10 = this.data;
        return i5 + (t10 == null ? 0 : t10.hashCode());
    }

    @NotNull
    public String toString() {
        return "BaseResponse(success=" + this.success + ", data=" + this.data + ")";
    }
}
