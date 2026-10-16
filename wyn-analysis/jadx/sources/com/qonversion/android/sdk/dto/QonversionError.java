package com.qonversion.android.sdk.dto;

import N0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wg.b;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÀ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J.\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\b\u0010\u001c\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/qonversion/android/sdk/dto/QonversionError;", "", "code", "Lcom/qonversion/android/sdk/dto/QonversionErrorCode;", "additionalMessage", "", "httpCode", "", "(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;)V", "getAdditionalMessage", "()Ljava/lang/String;", "getCode", "()Lcom/qonversion/android/sdk/dto/QonversionErrorCode;", "description", "getDescription", "getHttpCode$sdk_release", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component3$sdk_release", "copy", "(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;)Lcom/qonversion/android/sdk/dto/QonversionError;", "equals", "", "other", "hashCode", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class QonversionError {

    @NotNull
    private final String additionalMessage;

    @NotNull
    private final QonversionErrorCode code;

    @NotNull
    private final String description;

    @Nullable
    private final Integer httpCode;

    public QonversionError(@NotNull QonversionErrorCode code, @NotNull String additionalMessage, @Nullable Integer num) {
        AbstractC3340k.e(code, "code");
        AbstractC3340k.e(additionalMessage, "additionalMessage");
        this.code = code;
        this.additionalMessage = additionalMessage;
        this.httpCode = num;
        this.description = code.getSpecification();
    }

    public static /* synthetic */ QonversionError copy$default(QonversionError qonversionError, QonversionErrorCode qonversionErrorCode, String str, Integer num, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            qonversionErrorCode = qonversionError.code;
        }
        if ((i5 & 2) != 0) {
            str = qonversionError.additionalMessage;
        }
        if ((i5 & 4) != 0) {
            num = qonversionError.httpCode;
        }
        return qonversionError.copy(qonversionErrorCode, str, num);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final QonversionErrorCode getCode() {
        return this.code;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAdditionalMessage() {
        return this.additionalMessage;
    }

    @Nullable
    /* renamed from: component3$sdk_release, reason: from getter */
    public final Integer getHttpCode() {
        return this.httpCode;
    }

    @NotNull
    public final QonversionError copy(@NotNull QonversionErrorCode code, @NotNull String additionalMessage, @Nullable Integer httpCode) {
        AbstractC3340k.e(code, "code");
        AbstractC3340k.e(additionalMessage, "additionalMessage");
        return new QonversionError(code, additionalMessage, httpCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QonversionError)) {
            return false;
        }
        QonversionError qonversionError = (QonversionError) other;
        return this.code == qonversionError.code && AbstractC3340k.a(this.additionalMessage, qonversionError.additionalMessage) && AbstractC3340k.a(this.httpCode, qonversionError.httpCode);
    }

    @NotNull
    public final String getAdditionalMessage() {
        return this.additionalMessage;
    }

    @NotNull
    public final QonversionErrorCode getCode() {
        return this.code;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final Integer getHttpCode$sdk_release() {
        return this.httpCode;
    }

    public int hashCode() {
        int iC = a.c(this.code.hashCode() * 31, 31, this.additionalMessage);
        Integer num = this.httpCode;
        return iC + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        QonversionErrorCode qonversionErrorCode = this.code;
        String str = this.description;
        String str2 = this.additionalMessage;
        StringBuilder sb2 = new StringBuilder("QonversionError: {code=");
        sb2.append(qonversionErrorCode);
        sb2.append(", description=");
        sb2.append(str);
        sb2.append(", additionalMessage=");
        return b.c(sb2, str2, "}");
    }

    public /* synthetic */ QonversionError(QonversionErrorCode qonversionErrorCode, String str, Integer num, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(qonversionErrorCode, (i5 & 2) != 0 ? "" : str, (i5 & 4) != 0 ? null : num);
    }
}
