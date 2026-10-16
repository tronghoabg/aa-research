package androidx.webkit.internal;

import androidx.webkit.WebViewStartupException;
import j$.util.function.BiConsumer$CC;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class WebViewStartupExceptionBuilder implements BiConsumer<Integer, Object> {
    Integer mErrorCode;
    String mErrorMessage;

    public static WebViewStartupException buildException(Consumer<BiConsumer<Integer, Object>> consumer) {
        WebViewStartupExceptionBuilder webViewStartupExceptionBuilder = new WebViewStartupExceptionBuilder();
        consumer.accept(webViewStartupExceptionBuilder);
        Integer num = webViewStartupExceptionBuilder.mErrorCode;
        if (num == null) {
            return new WebViewStartupException(webViewStartupExceptionBuilder.mErrorMessage);
        }
        num.intValue();
        return new WebViewStartupException(webViewStartupExceptionBuilder.mErrorMessage);
    }

    @Override // java.util.function.BiConsumer
    public void accept(Integer num, Object obj) {
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            this.mErrorCode = (Integer) obj;
        } else if (iIntValue == 1) {
            this.mErrorMessage = (String) obj;
        } else {
            if (num.intValue() >= 0) {
                return;
            }
            Objects.toString(num);
            throw new UnsupportedOperationException("The current AndroidX version doesn't support this callback value: ".concat(String.valueOf(num)));
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
