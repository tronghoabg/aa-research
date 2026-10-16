package X1;

import N1.D;
import android.net.Uri;
import android.text.TextUtils;
import j$.util.DesugarTimeZone;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o2.o;

/* loaded from: classes.dex */
public final class e implements o {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f15953a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // o2.o
    public final Object t(Uri uri, S1.j jVar) throws IOException, NumberFormatException {
        String line = new BufferedReader(new InputStreamReader(jVar, StandardCharsets.UTF_8)).readLine();
        try {
            Matcher matcher = f15953a.matcher(line);
            if (!matcher.matches()) {
                throw D.b("Couldn't parse timestamp: " + line, null);
            }
            String strGroup = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(strGroup).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j8 = "+".equals(matcher.group(4)) ? 1L : -1L;
                long j10 = Long.parseLong(matcher.group(5));
                String strGroup2 = matcher.group(7);
                time -= (((j10 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60000) * j8;
            }
            return Long.valueOf(time);
        } catch (ParseException e7) {
            throw D.b(null, e7);
        }
    }
}
