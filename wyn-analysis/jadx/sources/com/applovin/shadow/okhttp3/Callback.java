package com.applovin.shadow.okhttp3;

import java.io.IOException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/applovin/shadow/okhttp3/Callback;", "", "Lcom/applovin/shadow/okhttp3/Call;", "call", "Ljava/io/IOException;", "e", "Lef/C;", "onFailure", "(Lcom/applovin/shadow/okhttp3/Call;Ljava/io/IOException;)V", "Lcom/applovin/shadow/okhttp3/Response;", "response", "onResponse", "(Lcom/applovin/shadow/okhttp3/Call;Lcom/applovin/shadow/okhttp3/Response;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Callback {
    void onFailure(@NotNull Call call, @NotNull IOException e7);

    void onResponse(@NotNull Call call, @NotNull Response response) throws IOException;
}
