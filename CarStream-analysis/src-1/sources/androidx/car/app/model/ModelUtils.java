package androidx.car.app.model;

import android.text.Spanned;
import android.text.style.CharacterStyle;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
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
        CarText title = row.getTitle();
        Objects.requireNonNull(title);
        if (checkCarTextHasSpanType(title, cls)) {
            return true;
        }
        List<CarText> texts = row.getTexts();
        for (int i = 0; i < texts.size(); i++) {
            if (checkCarTextHasSpanType(texts.get(i), cls)) {
                return true;
            }
        }
        return false;
    }

    public static void validateAllNonBrowsableRowsHaveDistance(List<Item> list) {
        int i = 0;
        int i2 = 0;
        for (Item item : list) {
            if (!(item instanceof Row)) {
                throw new IllegalArgumentException("Item in the list is not a Row");
            }
            Row row = (Row) item;
            if (!row.isBrowsable()) {
                i++;
            }
            if (checkRowHasSpanType(row, DistanceSpan.class)) {
                i2++;
            }
        }
        if (i > i2) {
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
                boolean z = false;
                boolean z2 = row.getImage() != null;
                Place place = metadata.getPlace();
                if (place != null && place.getMarker() != null) {
                    z = true;
                }
                if (z2 && z) {
                    throw new IllegalArgumentException("Rows can't have both a marker and an image");
                }
            }
        }
    }
}
