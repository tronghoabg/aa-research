package androidx.car.app.model;

import android.text.Spanned;
import android.text.style.CharacterStyle;
import j$.util.Objects;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ModelUtils {
    private ModelUtils() {
    }

    private static boolean checkCarTextHasSpanType(CarText carText, Class<? extends CharacterStyle> cls) {
        if (carText.isEmpty()) {
            return false;
        }
        Spanned spanned = (Spanned) carText.toCharSequence();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (cls.isInstance(obj) && spanStart >= 0 && spanStart != spanEnd && spanStart < spanned.length()) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkRowHasSpanType(Row row, Class<? extends CharacterStyle> cls) {
        if (checkCarTextHasSpanType((CarText) Objects.requireNonNull(row.getTitle()), cls)) {
            return true;
        }
        List<CarText> texts = row.getTexts();
        for (int i2 = 0; i2 < texts.size(); i2++) {
            if (checkCarTextHasSpanType(texts.get(i2), cls)) {
                return true;
            }
        }
        return false;
    }

    public static void validateAllNonBrowsableRowsHaveDistance(List<Item> list) {
        int i2 = 0;
        int i3 = 0;
        for (Item item : list) {
            if (!(item instanceof Row)) {
                throw new IllegalArgumentException("Item in the list is not a Row");
            }
            Row row = (Row) item;
            if (!row.isBrowsable()) {
                i2++;
            }
            if (checkRowHasSpanType(row, DistanceSpan.class)) {
                i3++;
            }
        }
        if (i2 > i3) {
            throw new IllegalArgumentException("All non-browsable rows must have a distance span attached to either its title or texts");
        }
    }

    public static void validateAllRowsHaveDistanceOrDuration(List<Item> list) {
        for (Item item : list) {
            if (!(item instanceof Row)) {
                throw new IllegalArgumentException("Item in the list is not a Row");
            }
            Row row = (Row) item;
            if (!checkRowHasSpanType(row, DistanceSpan.class) && !checkRowHasSpanType(row, DurationSpan.class)) {
                throw new IllegalArgumentException("All rows must have either a distance or duration span attached to either its title or texts");
            }
        }
    }

    public static void validateAllRowsHaveOnlySmallImages(List<Item> list) {
        for (Item item : list) {
            if (!(item instanceof Row)) {
                throw new IllegalArgumentException("Item in the list is not a Row");
            }
            Row row = (Row) item;
            if (row.getImage() != null && row.getRowImageType() == 2) {
                throw new IllegalArgumentException("Rows must only use small-sized images");
            }
        }
    }

    public static void validateNoRowsHaveBothMarkersAndImages(List<Item> list) {
        for (Item item : list) {
            if (!(item instanceof Row)) {
                throw new IllegalArgumentException("Item in the list is not a Row");
            }
            Row row = (Row) item;
            Metadata metadata = row.getMetadata();
            if (metadata != null) {
                CarIcon image = row.getImage();
                Place place = metadata.getPlace();
                boolean z = false;
                if (place != null && place.getMarker() != null) {
                    z = true;
                }
                if (image != null && z) {
                    throw new IllegalArgumentException("Rows can't have both a marker and an image");
                }
            }
        }
    }
}
