package androidx.car.app.notification;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import androidx.car.app.R;
import androidx.car.app.model.CarColor;
import androidx.car.app.notification.CarAppExtender;
import androidx.car.app.utils.CommonUtils;
import androidx.core.app.NotificationChannelCompat;
import androidx.core.app.NotificationChannelGroupCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class CarNotificationManager {
    private final Context mContext;
    private final NotificationManagerCompat mNotificationManagerCompat;
    private final Integer mPrimaryColor;
    private final Integer mPrimaryColorDark;
    private final Integer mSecondaryColor;
    private final Integer mSecondaryColorDark;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Api29Impl {
        private Api29Impl() {
        }

        public static void convertActionsToCompatActions(NotificationCompat.Builder builder, List<Notification.Action> list) {
            if (list.isEmpty()) {
                return;
            }
            builder.clearActions();
            Iterator<Notification.Action> it = list.iterator();
            while (it.hasNext()) {
                builder.addAction(fromAndroidAction(it.next()));
            }
        }

        private static NotificationCompat.Action fromAndroidAction(Notification.Action action) {
            return new NotificationCompat.Action(action.getIcon() == null ? 0 : action.getIcon().getResId(), action.title, action.actionIntent);
        }
    }

    private CarNotificationManager(Context context) {
        Objects.requireNonNull(context);
        this.mContext = context;
        this.mNotificationManagerCompat = NotificationManagerCompat.from(context);
        Context contextCreateConfigurationContext = context.createConfigurationContext(context.getResources().getConfiguration());
        int iLoadThemeId = loadThemeId(context);
        if (iLoadThemeId != 0) {
            contextCreateConfigurationContext.setTheme(iLoadThemeId);
        }
        Resources.Theme theme = contextCreateConfigurationContext.getTheme();
        Resources resources = theme.getResources();
        this.mPrimaryColor = getColor(resources.getIdentifier("carColorPrimary", "attr", context.getPackageName()), theme);
        this.mPrimaryColorDark = getColor(resources.getIdentifier("carColorPrimaryDark", "attr", context.getPackageName()), theme);
        this.mSecondaryColor = getColor(resources.getIdentifier("carColorSecondary", "attr", context.getPackageName()), theme);
        this.mSecondaryColorDark = getColor(resources.getIdentifier("carColorSecondaryDark", "attr", context.getPackageName()), theme);
    }

    public static CarNotificationManager from(Context context) {
        Objects.requireNonNull(context);
        return new CarNotificationManager(context);
    }

    private static Integer getColor(int i, Resources.Theme theme) {
        if (i == 0) {
            return null;
        }
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(new int[]{i});
        Integer numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        return numValueOf;
    }

    public static Set<String> getEnabledListenerPackages(Context context) {
        Objects.requireNonNull(context);
        return NotificationManagerCompat.getEnabledListenerPackages(context);
    }

    private static int loadThemeId(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                return bundle.getInt("androidx.car.app.theme");
            }
            return 0;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private Notification updateForAutomotive(NotificationCompat.Builder builder) {
        Integer colorInt;
        if (Build.VERSION.SDK_INT < 29) {
            throw new UnsupportedOperationException("Not supported for Automotive OS before API 29.");
        }
        CarAppExtender carAppExtender = new CarAppExtender(builder.build());
        Api29Impl.convertActionsToCompatActions(builder, carAppExtender.getActions());
        CarColor color = carAppExtender.getColor();
        if (color != null && (colorInt = getColorInt(color)) != null) {
            builder.setColorized(true);
            builder.setColor(colorInt.intValue());
        }
        PendingIntent contentIntent = carAppExtender.getContentIntent();
        if (contentIntent != null) {
            builder.setContentIntent(contentIntent);
        }
        CharSequence contentTitle = carAppExtender.getContentTitle();
        if (contentTitle != null) {
            builder.setContentTitle(contentTitle);
        }
        CharSequence contentText = carAppExtender.getContentText();
        if (contentText != null) {
            builder.setContentText(contentText);
        }
        PendingIntent deleteIntent = carAppExtender.getDeleteIntent();
        if (deleteIntent != null) {
            builder.setDeleteIntent(deleteIntent);
        }
        String channelId = carAppExtender.getChannelId();
        if (channelId != null) {
            builder.setChannelId(channelId);
        }
        Bitmap largeIcon = carAppExtender.getLargeIcon();
        if (largeIcon != null) {
            builder.setLargeIcon(largeIcon);
        }
        int smallIcon = carAppExtender.getSmallIcon();
        if (smallIcon != 0) {
            builder.setSmallIcon(smallIcon);
        }
        return builder.build();
    }

    public boolean areNotificationsEnabled() {
        return this.mNotificationManagerCompat.areNotificationsEnabled();
    }

    public void cancel(int i) {
        this.mNotificationManagerCompat.cancel(i);
    }

    public void cancelAll() {
        this.mNotificationManagerCompat.cancelAll();
    }

    public void createNotificationChannel(NotificationChannelCompat notificationChannelCompat) {
        NotificationManagerCompat notificationManagerCompat = this.mNotificationManagerCompat;
        Objects.requireNonNull(notificationChannelCompat);
        notificationManagerCompat.createNotificationChannel(notificationChannelCompat);
    }

    public void createNotificationChannelGroup(NotificationChannelGroupCompat notificationChannelGroupCompat) {
        NotificationManagerCompat notificationManagerCompat = this.mNotificationManagerCompat;
        Objects.requireNonNull(notificationChannelGroupCompat);
        notificationManagerCompat.createNotificationChannelGroup(notificationChannelGroupCompat);
    }

    public void createNotificationChannelGroups(List<NotificationChannelGroupCompat> list) {
        NotificationManagerCompat notificationManagerCompat = this.mNotificationManagerCompat;
        Objects.requireNonNull(list);
        notificationManagerCompat.createNotificationChannelGroupsCompat(list);
    }

    public void createNotificationChannels(List<NotificationChannelCompat> list) {
        NotificationManagerCompat notificationManagerCompat = this.mNotificationManagerCompat;
        Objects.requireNonNull(list);
        notificationManagerCompat.createNotificationChannelsCompat(list);
    }

    public void deleteNotificationChannel(String str) {
        NotificationManagerCompat notificationManagerCompat = this.mNotificationManagerCompat;
        Objects.requireNonNull(str);
        notificationManagerCompat.deleteNotificationChannel(str);
    }

    public void deleteNotificationChannelGroup(String str) {
        NotificationManagerCompat notificationManagerCompat = this.mNotificationManagerCompat;
        Objects.requireNonNull(str);
        notificationManagerCompat.deleteNotificationChannelGroup(str);
    }

    public void deleteUnlistedNotificationChannels(Collection<String> collection) {
        NotificationManagerCompat notificationManagerCompat = this.mNotificationManagerCompat;
        Objects.requireNonNull(collection);
        notificationManagerCompat.deleteUnlistedNotificationChannels(collection);
    }

    public Integer getColorInt(CarColor carColor) {
        boolean z = (this.mContext.getResources().getConfiguration().uiMode & 48) == 32;
        int type = carColor.getType();
        if (type == 0) {
            return Integer.valueOf(z ? carColor.getColorDark() : carColor.getColor());
        }
        switch (type) {
            case 2:
                return z ? this.mPrimaryColorDark : this.mPrimaryColor;
            case 3:
                return z ? this.mSecondaryColorDark : this.mSecondaryColor;
            case 4:
                return Integer.valueOf(this.mContext.getResources().getColor(R.color.carColorRed));
            case 5:
                return Integer.valueOf(this.mContext.getResources().getColor(R.color.carColorGreen));
            case 6:
                return Integer.valueOf(this.mContext.getResources().getColor(R.color.carColorBlue));
            case 7:
                return Integer.valueOf(this.mContext.getResources().getColor(R.color.carColorYellow));
            default:
                return null;
        }
    }

    public int getImportance() {
        return this.mNotificationManagerCompat.getImportance();
    }

    public NotificationChannelCompat getNotificationChannel(String str) {
        NotificationManagerCompat notificationManagerCompat = this.mNotificationManagerCompat;
        Objects.requireNonNull(str);
        return notificationManagerCompat.getNotificationChannelCompat(str);
    }

    public NotificationChannelGroupCompat getNotificationChannelGroup(String str) {
        NotificationManagerCompat notificationManagerCompat = this.mNotificationManagerCompat;
        Objects.requireNonNull(str);
        return notificationManagerCompat.getNotificationChannelGroupCompat(str);
    }

    public List<NotificationChannelGroupCompat> getNotificationChannelGroups() {
        return this.mNotificationManagerCompat.getNotificationChannelGroupsCompat();
    }

    public List<NotificationChannelCompat> getNotificationChannels() {
        return this.mNotificationManagerCompat.getNotificationChannelsCompat();
    }

    public void notify(int i, NotificationCompat.Builder builder) {
        NotificationManagerCompat notificationManagerCompat = this.mNotificationManagerCompat;
        Objects.requireNonNull(builder);
        notificationManagerCompat.notify(i, updateForCar(builder));
    }

    public Notification updateForCar(NotificationCompat.Builder builder) {
        if (CommonUtils.isAutomotiveOS(this.mContext)) {
            return updateForAutomotive(builder);
        }
        if (!CarAppExtender.isExtended(builder.build())) {
            builder.extend(new CarAppExtender.Builder().build());
        }
        return builder.build();
    }

    public void cancel(String str, int i) {
        this.mNotificationManagerCompat.cancel(str, i);
    }

    public NotificationChannelCompat getNotificationChannel(String str, String str2) {
        NotificationManagerCompat notificationManagerCompat = this.mNotificationManagerCompat;
        Objects.requireNonNull(str);
        Objects.requireNonNull(str2);
        return notificationManagerCompat.getNotificationChannelCompat(str, str2);
    }

    public void notify(String str, int i, NotificationCompat.Builder builder) {
        NotificationManagerCompat notificationManagerCompat = this.mNotificationManagerCompat;
        Objects.requireNonNull(builder);
        notificationManagerCompat.notify(str, i, updateForCar(builder));
    }
}
