package androidx.car.app.notification;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.car.app.model.CarColor;
import androidx.car.app.serialization.Bundler;
import androidx.car.app.serialization.BundlerException;
import androidx.car.app.utils.CollectionUtils;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class CarAppExtender implements NotificationCompat.Extender {
    private static final String EXTRA_ACTIONS = "actions";
    private static final String EXTRA_CAR_EXTENDER = "androidx.car.app.EXTENSIONS";
    private static final String EXTRA_CHANNEL_ID = "channel_id";
    private static final String EXTRA_COLOR = "color";
    private static final String EXTRA_CONTENT_INTENT = "content_intent";
    private static final String EXTRA_CONTENT_TEXT = "content_text";
    private static final String EXTRA_CONTENT_TITLE = "content_title";
    private static final String EXTRA_DELETE_INTENT = "delete_intent";
    private static final String EXTRA_IMPORTANCE = "importance";
    private static final String EXTRA_LARGE_BITMAP = "large_bitmap";
    private static final String EXTRA_SMALL_RES_ID = "small_res_id";
    private static final String TAG = "CarAppExtender";
    private ArrayList<Notification.Action> mActions;
    private String mChannelId;
    private CarColor mColor;
    private PendingIntent mContentIntent;
    private CharSequence mContentText;
    private CharSequence mContentTitle;
    private PendingIntent mDeleteIntent;
    private int mImportance;
    private Bitmap mLargeIconBitmap;
    private int mSmallIconResId;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        String mChannelId;
        CarColor mColor;
        PendingIntent mContentIntent;
        CharSequence mContentText;
        CharSequence mContentTitle;
        PendingIntent mDeleteIntent;
        Bitmap mLargeIconBitmap;
        int mSmallIconResId;
        final ArrayList<Notification.Action> mActions = new ArrayList<>();
        int mImportance = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;

        public Builder addAction(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            ArrayList<Notification.Action> arrayList = this.mActions;
            Objects.requireNonNull(charSequence);
            Objects.requireNonNull(pendingIntent);
            arrayList.add(new Notification.Action(i, charSequence, pendingIntent));
            return this;
        }

        public CarAppExtender build() {
            return new CarAppExtender(this);
        }

        public Builder setChannelId(String str) {
            this.mChannelId = str;
            return this;
        }

        public Builder setColor(CarColor carColor) {
            Objects.requireNonNull(carColor);
            this.mColor = carColor;
            return this;
        }

        public Builder setContentIntent(PendingIntent pendingIntent) {
            Objects.requireNonNull(pendingIntent);
            this.mContentIntent = pendingIntent;
            return this;
        }

        public Builder setContentText(CharSequence charSequence) {
            Objects.requireNonNull(charSequence);
            this.mContentText = charSequence;
            return this;
        }

        public Builder setContentTitle(CharSequence charSequence) {
            Objects.requireNonNull(charSequence);
            this.mContentTitle = charSequence;
            return this;
        }

        public Builder setDeleteIntent(PendingIntent pendingIntent) {
            Objects.requireNonNull(pendingIntent);
            this.mDeleteIntent = pendingIntent;
            return this;
        }

        public Builder setImportance(int i) {
            this.mImportance = i;
            return this;
        }

        public Builder setLargeIcon(Bitmap bitmap) {
            Objects.requireNonNull(bitmap);
            this.mLargeIconBitmap = bitmap;
            return this;
        }

        public Builder setSmallIcon(int i) {
            this.mSmallIconResId = i;
            return this;
        }
    }

    public CarAppExtender(Notification notification) {
        Bundle bundle;
        Bundle extras = NotificationCompat.getExtras(notification);
        if (extras == null || (bundle = extras.getBundle(EXTRA_CAR_EXTENDER)) == null) {
            return;
        }
        this.mContentTitle = bundle.getCharSequence(EXTRA_CONTENT_TITLE);
        this.mContentText = bundle.getCharSequence(EXTRA_CONTENT_TEXT);
        this.mSmallIconResId = bundle.getInt(EXTRA_SMALL_RES_ID);
        this.mLargeIconBitmap = (Bitmap) bundle.getParcelable(EXTRA_LARGE_BITMAP);
        this.mContentIntent = (PendingIntent) bundle.getParcelable(EXTRA_CONTENT_INTENT);
        this.mDeleteIntent = (PendingIntent) bundle.getParcelable(EXTRA_DELETE_INTENT);
        ArrayList<Notification.Action> parcelableArrayList = bundle.getParcelableArrayList(EXTRA_ACTIONS);
        this.mActions = parcelableArrayList == null ? new ArrayList<>() : parcelableArrayList;
        this.mImportance = bundle.getInt(EXTRA_IMPORTANCE, NotificationManagerCompat.IMPORTANCE_UNSPECIFIED);
        Bundle bundle2 = bundle.getBundle(EXTRA_COLOR);
        if (bundle2 != null) {
            try {
                this.mColor = (CarColor) Bundler.fromBundle(bundle2);
            } catch (BundlerException unused) {
            }
        }
        this.mChannelId = bundle.getString(EXTRA_CHANNEL_ID);
    }

    private Bundle createExtrasBundle() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.mContentTitle;
        if (charSequence != null) {
            bundle.putCharSequence(EXTRA_CONTENT_TITLE, charSequence);
        }
        CharSequence charSequence2 = this.mContentText;
        if (charSequence2 != null) {
            bundle.putCharSequence(EXTRA_CONTENT_TEXT, charSequence2);
        }
        int i = this.mSmallIconResId;
        if (i != 0) {
            bundle.putInt(EXTRA_SMALL_RES_ID, i);
        }
        Bitmap bitmap = this.mLargeIconBitmap;
        if (bitmap != null) {
            bundle.putParcelable(EXTRA_LARGE_BITMAP, bitmap);
        }
        PendingIntent pendingIntent = this.mContentIntent;
        if (pendingIntent != null) {
            bundle.putParcelable(EXTRA_CONTENT_INTENT, pendingIntent);
        }
        PendingIntent pendingIntent2 = this.mDeleteIntent;
        if (pendingIntent2 != null) {
            bundle.putParcelable(EXTRA_DELETE_INTENT, pendingIntent2);
        }
        ArrayList<Notification.Action> arrayList = this.mActions;
        if (arrayList != null && !arrayList.isEmpty()) {
            bundle.putParcelableArrayList(EXTRA_ACTIONS, this.mActions);
        }
        bundle.putInt(EXTRA_IMPORTANCE, this.mImportance);
        CarColor carColor = this.mColor;
        if (carColor != null) {
            try {
                bundle.putBundle(EXTRA_COLOR, Bundler.toBundle(carColor));
            } catch (BundlerException unused) {
            }
        }
        String str = this.mChannelId;
        if (str != null) {
            bundle.putString(EXTRA_CHANNEL_ID, str);
        }
        return bundle;
    }

    public static boolean isExtended(Notification notification) {
        Objects.requireNonNull(notification);
        Bundle extras = NotificationCompat.getExtras(notification);
        return (extras == null || extras.getBundle(EXTRA_CAR_EXTENDER) == null) ? false : true;
    }

    @Override // androidx.core.app.NotificationCompat.Extender
    public NotificationCompat.Builder extend(NotificationCompat.Builder builder) {
        Objects.requireNonNull(builder);
        builder.getExtras().putBundle(EXTRA_CAR_EXTENDER, createExtrasBundle());
        return builder;
    }

    public List<Notification.Action> getActions() {
        return CollectionUtils.emptyIfNull(this.mActions);
    }

    public String getChannelId() {
        return this.mChannelId;
    }

    public CarColor getColor() {
        return this.mColor;
    }

    public PendingIntent getContentIntent() {
        return this.mContentIntent;
    }

    public CharSequence getContentText() {
        return this.mContentText;
    }

    public CharSequence getContentTitle() {
        return this.mContentTitle;
    }

    public PendingIntent getDeleteIntent() {
        return this.mDeleteIntent;
    }

    public int getImportance() {
        return this.mImportance;
    }

    public Bitmap getLargeIcon() {
        return this.mLargeIconBitmap;
    }

    public int getSmallIcon() {
        return this.mSmallIconResId;
    }

    public Notification.Builder extend(Notification.Builder builder) {
        Objects.requireNonNull(builder);
        builder.getExtras().putBundle(EXTRA_CAR_EXTENDER, createExtrasBundle());
        return builder;
    }

    public CarAppExtender(Builder builder) {
        this.mContentTitle = builder.mContentTitle;
        this.mContentText = builder.mContentText;
        this.mSmallIconResId = builder.mSmallIconResId;
        this.mLargeIconBitmap = builder.mLargeIconBitmap;
        this.mContentIntent = builder.mContentIntent;
        this.mDeleteIntent = builder.mDeleteIntent;
        this.mActions = builder.mActions;
        this.mImportance = builder.mImportance;
        this.mColor = builder.mColor;
        this.mChannelId = builder.mChannelId;
    }
}
