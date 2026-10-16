package com.google.android.libraries.vision.visionkit.pipeline.alt;

import H7.C0565d;
import H7.W;
import androidx.annotation.Keep;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbko;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

@Keep
@UsedByNative("pipeline_jni.cc")
/* loaded from: classes4.dex */
public class PipelineException extends Exception {
    private static final String ROOT_CAUSE_DELIMITER = "#vk ";
    private final c statusCode;
    private final String statusMessage;
    private final W visionkitStatus;

    public PipelineException(int i5, String str) {
        super(N0.a.g(c.values()[i5].f26761a, ": ", str));
        this.statusCode = c.values()[i5];
        this.statusMessage = str;
        this.visionkitStatus = null;
    }

    public List<C0565d> getComponentStatuses() {
        W w2 = this.visionkitStatus;
        return w2 != null ? w2.zbf() : zbkx.zbh();
    }

    public zbki<String> getRootCauseMessage() {
        Object next;
        Object obj;
        if (!this.statusMessage.contains(ROOT_CAUSE_DELIMITER)) {
            return zbki.zbd();
        }
        List listZbb = zbko.zba(ROOT_CAUSE_DELIMITER).zbb(this.statusMessage);
        if (listZbb instanceof List) {
            List list = listZbb;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            obj = list.get(list.size() - 1);
        } else {
            Iterator it = listZbb.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        }
        return zbki.zbe((String) obj);
    }

    public c getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    private PipelineException(W w2) {
        super(N0.a.g(c.values()[w2.a()].f26761a, ": ", w2.c()));
        this.statusCode = c.values()[w2.a()];
        this.statusMessage = w2.c();
        this.visionkitStatus = w2;
    }

    @Keep
    @UsedByNative("pipeline_jni.cc")
    public PipelineException(byte[] bArr) throws zbuq {
        this(W.b(bArr, zbtp.zba()));
    }
}
