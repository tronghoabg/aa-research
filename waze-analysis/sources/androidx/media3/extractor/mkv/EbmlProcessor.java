package androidx.media3.extractor.mkv;

import androidx.media3.extractor.ExtractorInput;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface EbmlProcessor {
    public static final int ELEMENT_TYPE_BINARY = 4;
    public static final int ELEMENT_TYPE_FLOAT = 5;
    public static final int ELEMENT_TYPE_MASTER = 1;
    public static final int ELEMENT_TYPE_STRING = 3;
    public static final int ELEMENT_TYPE_UNKNOWN = 0;
    public static final int ELEMENT_TYPE_UNSIGNED_INT = 2;

    /* compiled from: WazeSource */
    @Target({java.lang.annotation.ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ElementType {
    }

    void binaryElement(int i2, int i3, ExtractorInput extractorInput);

    void endMasterElement(int i2);

    void floatElement(int i2, double d2);

    int getElementType(int i2);

    void integerElement(int i2, long j2);

    boolean isLevel1Element(int i2);

    void startMasterElement(int i2, long j2, long j3);

    void stringElement(int i2, String str);
}
