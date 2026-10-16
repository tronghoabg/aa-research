package H6;

import D6.C0392q;
import D6.C0395s;
import android.content.Context;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzcaf;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class p implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4966a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4967b;

    /* renamed from: c, reason: collision with root package name */
    public String f4968c;

    public p(Context context, String str) {
        this.f4966a = context;
        this.f4967b = str;
    }

    public final o a(HashMap map, String str) {
        o oVar = o.f4963c;
        o oVar2 = o.f4962b;
        if (str != null) {
            zzbio zzbioVar = zzbix.zzg;
            C0395s c0395s = C0395s.f2489e;
            if (!((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() || !str.isEmpty()) {
                if (!((Boolean) c0395s.f2492c.zzd(zzbix.zzdn)).booleanValue() || !C0392q.f2477g.f2480c) {
                    try {
                        StringBuilder sb2 = new StringBuilder(str.length() + 13);
                        sb2.append("Pinging URL: ");
                        sb2.append(str);
                        l.a(sb2.toString());
                        HttpURLConnection httpURLConnection = (HttpURLConnection) b(str).openConnection();
                        try {
                            f fVar = C0392q.f2477g.f2478a;
                            String str2 = this.f4967b;
                            httpURLConnection.setConnectTimeout(60000);
                            httpURLConnection.setInstanceFollowRedirects(true);
                            httpURLConnection.setReadTimeout(60000);
                            if (str2 != null) {
                                httpURLConnection.setRequestProperty("User-Agent", str2);
                            }
                            httpURLConnection.setUseCaches(false);
                            if (map != null) {
                                for (Map.Entry entry : map.entrySet()) {
                                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                }
                            }
                            i iVar = new i();
                            iVar.a(httpURLConnection, null);
                            int responseCode = httpURLConnection.getResponseCode();
                            iVar.b(httpURLConnection, responseCode);
                            if (responseCode < 200 || responseCode >= 300) {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(responseCode).length() + 54 + str.length());
                                sb3.append("Received non-success response code ");
                                sb3.append(responseCode);
                                sb3.append(" from pinging URL: ");
                                sb3.append(str);
                                l.f(sb3.toString());
                                if (responseCode == 502) {
                                    oVar2 = oVar;
                                }
                            } else {
                                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzje)).booleanValue()) {
                                    this.f4968c = httpURLConnection.getHeaderField("X-Afma-Ad-Event-Value");
                                }
                                oVar2 = o.f4961a;
                            }
                            httpURLConnection.disconnect();
                            return oVar2;
                        } catch (Throwable th) {
                            httpURLConnection.disconnect();
                            throw th;
                        }
                    } catch (MalformedURLException e7) {
                        e = e7;
                        oVar = oVar2;
                        c(str, e);
                        return oVar;
                    } catch (IOException e10) {
                        e = e10;
                        String message = e.getMessage();
                        StringBuilder sb4 = new StringBuilder(String.valueOf(message).length() + str.length() + 27);
                        sb4.append("Error while pinging URL: ");
                        sb4.append(str);
                        sb4.append(". ");
                        sb4.append(message);
                        l.f(sb4.toString());
                        return oVar;
                    } catch (IndexOutOfBoundsException e11) {
                        e = e11;
                        oVar = oVar2;
                        c(str, e);
                        return oVar;
                    } catch (RuntimeException e12) {
                        e = e12;
                        String message2 = e.getMessage();
                        StringBuilder sb42 = new StringBuilder(String.valueOf(message2).length() + str.length() + 27);
                        sb42.append("Error while pinging URL: ");
                        sb42.append(str);
                        sb42.append(". ");
                        sb42.append(message2);
                        l.f(sb42.toString());
                        return oVar;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        return oVar2;
    }

    public final URL b(String str) throws MalformedURLException {
        URL url = null;
        try {
            url = new URI(str).toURL();
        } catch (IllegalArgumentException e7) {
            e = e7;
            c(str, e);
        } catch (MalformedURLException e10) {
            e = e10;
            c(str, e);
        } catch (URISyntaxException e11) {
            c(str, e11);
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzf)).booleanValue()) {
                try {
                    l.a("Attempting to parse components, encode, and reconstruct URI.");
                    URL url2 = new URL(str);
                    URI uri = new URI(url2.getProtocol(), url2.getUserInfo(), url2.getHost(), url2.getPort(), url2.getPath(), url2.getQuery(), url2.getRef());
                    url = uri.toURL();
                    String string = uri.toString();
                    StringBuilder sb2 = new StringBuilder(str.length() + 114 + string.length());
                    sb2.append("Successfully constructed URL after component encoding via new URI(parts).toURL() for original: \"");
                    sb2.append(str);
                    sb2.append("\" -> encoded URI: ");
                    sb2.append(string);
                    l.a(sb2.toString());
                } catch (IllegalArgumentException | MalformedURLException | URISyntaxException e12) {
                    c(str, e12);
                }
            }
        }
        if (url != null) {
            return url;
        }
        StringBuilder sb3 = new StringBuilder(str.length() + 47);
        sb3.append("Falling back to direct new URL(\"");
        sb3.append(str);
        sb3.append("\") constructor.");
        l.a(sb3.toString());
        return new URL(str);
    }

    public final void c(String str, Exception exc) {
        String message = exc.getMessage();
        StringBuilder sb2 = new StringBuilder(str.length() + 32 + String.valueOf(message).length());
        sb2.append("Error while parsing ping URL: ");
        sb2.append(str);
        sb2.append(". ");
        sb2.append(message);
        l.f(sb2.toString());
        zzcaf.zza(this.f4966a).zzi(exc, "HttpUrlPinger.pingUrl", ((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzou)).intValue() / 100.0f);
    }

    @Override // H6.e
    public final o zza(String str) {
        return a(null, str);
    }
}
