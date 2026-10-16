package Ge;

import com.qonversion.android.sdk.dto.QonversionError;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final String f4777a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4778b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4779c;

    public v(QonversionError error) {
        AbstractC3340k.e(error, "error");
        String code = error.getCode().toString();
        String description = error.getDescription();
        String additionalMessage = error.getAdditionalMessage();
        AbstractC3340k.e(code, "code");
        AbstractC3340k.e(description, "description");
        AbstractC3340k.e(additionalMessage, "additionalMessage");
        this.f4777a = code;
        this.f4778b = description;
        this.f4779c = additionalMessage;
    }
}
