package com.qonversion.android.sdk.internal;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.applovin.impl.mediation.ads.f;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/qonversion/android/sdk/internal/FacebookAttribution;", "", "<init>", "()V", "Landroid/content/ContentResolver;", "contentResolver", "Ljava/lang/ref/WeakReference;", "Lcom/qonversion/android/sdk/internal/FacebookAttributionListener;", "listenerRef", "Lef/C;", "getAttributionIdAsync", "(Landroid/content/ContentResolver;Ljava/lang/ref/WeakReference;)V", "resultListener", "getAttributionId", "(Landroid/content/ContentResolver;Lcom/qonversion/android/sdk/internal/FacebookAttributionListener;)V", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FacebookAttribution {

    @NotNull
    private static final String ATTRIBUTION_ID_COLUMN_NAME = "aid";
    private static final Uri ATTRIBUTION_ID_CONTENT_URI = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getAttributionId$lambda$0(FacebookAttribution this$0, ContentResolver contentResolver, WeakReference listenerRef) {
        AbstractC3340k.e(this$0, "this$0");
        AbstractC3340k.e(contentResolver, "$contentResolver");
        AbstractC3340k.e(listenerRef, "$listenerRef");
        this$0.getAttributionIdAsync(contentResolver, listenerRef);
    }

    private final void getAttributionIdAsync(ContentResolver contentResolver, WeakReference<FacebookAttributionListener> listenerRef) {
        Cursor cursorQuery;
        int columnIndex;
        String string = null;
        try {
            cursorQuery = contentResolver.query(ATTRIBUTION_ID_CONTENT_URI, new String[]{ATTRIBUTION_ID_COLUMN_NAME}, null, null, null);
        } catch (Exception unused) {
            cursorQuery = null;
        }
        if (cursorQuery != null && cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex(ATTRIBUTION_ID_COLUMN_NAME)) >= 0) {
            string = cursorQuery.getString(columnIndex);
            cursorQuery.close();
        }
        FacebookAttributionListener facebookAttributionListener = listenerRef.get();
        if (facebookAttributionListener != null) {
            facebookAttributionListener.onFbAttributionIdResult(string);
        }
    }

    public final void getAttributionId(@NotNull ContentResolver contentResolver, @NotNull FacebookAttributionListener resultListener) {
        AbstractC3340k.e(contentResolver, "contentResolver");
        AbstractC3340k.e(resultListener, "resultListener");
        Executors.newSingleThreadExecutor().execute(new f(this, contentResolver, new WeakReference(resultListener), 11));
    }
}
