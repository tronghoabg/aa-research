package R5;

import A7.AbstractC0279p0;
import b6.C1516a;
import java.util.UUID;
import ka.AbstractC3256n;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f10310a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f10311b = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static b6.e a(int i5, Y4.b bVar) {
        int iD = bVar.d();
        if (bVar.d() == 1684108385) {
            bVar.B(8);
            String strM = bVar.m(iD - 16);
            return new b6.e("und", strM, strM);
        }
        AbstractC4256a.E("MetadataUtil", "Failed to parse comment attribute: " + H5.a.e(i5));
        return null;
    }

    public static C1516a b(Y4.b bVar) {
        int iD = bVar.d();
        if (bVar.d() != 1684108385) {
            AbstractC4256a.E("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iD2 = bVar.d() & 16777215;
        String str = iD2 == 13 ? "image/jpeg" : iD2 == 14 ? "image/png" : null;
        if (str == null) {
            AbstractC0279p0.u(iD2, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        bVar.B(4);
        int i5 = iD - 16;
        byte[] bArr = new byte[i5];
        bVar.c(0, i5, bArr);
        return new C1516a(str, null, 3, bArr);
    }

    public static b6.m c(int i5, Y4.b bVar, String str) {
        int iD = bVar.d();
        if (bVar.d() == 1684108385 && iD >= 22) {
            bVar.B(10);
            int iV = bVar.v();
            if (iV > 0) {
                String strG = AbstractC3256n.g(iV, "");
                int iV2 = bVar.v();
                if (iV2 > 0) {
                    strG = strG + "/" + iV2;
                }
                return new b6.m(str, null, strG);
            }
        }
        AbstractC4256a.E("MetadataUtil", "Failed to parse index/count attribute: " + H5.a.e(i5));
        return null;
    }

    public static S3.l d(byte[] bArr) {
        Y4.b bVar = new Y4.b(bArr);
        if (bVar.f16681c >= 32) {
            bVar.A(0);
            if (bVar.d() == bVar.a() + 4 && bVar.d() == 1886614376) {
                int iN = H5.a.n(bVar.d());
                if (iN > 1) {
                    AbstractC0279p0.u(iN, "Unsupported pssh version: ", "PsshAtomUtil");
                    return null;
                }
                UUID uuid = new UUID(bVar.k(), bVar.k());
                if (iN == 1) {
                    bVar.B(bVar.t() * 16);
                }
                int iT = bVar.t();
                if (iT == bVar.a()) {
                    byte[] bArr2 = new byte[iT];
                    bVar.c(0, iT, bArr2);
                    return new S3.l(uuid, iN, bArr2);
                }
            }
        }
        return null;
    }

    public static b6.m e(int i5, Y4.b bVar, String str) {
        int iD = bVar.d();
        if (bVar.d() == 1684108385) {
            bVar.B(8);
            return new b6.m(str, null, bVar.m(iD - 16));
        }
        AbstractC4256a.E("MetadataUtil", "Failed to parse text attribute: " + H5.a.e(i5));
        return null;
    }

    public static b6.i f(int i5, String str, Y4.b bVar, boolean z2, boolean z10) {
        int iG = g(bVar);
        if (z10) {
            iG = Math.min(1, iG);
        }
        if (iG >= 0) {
            return z2 ? new b6.m(str, null, Integer.toString(iG)) : new b6.e("und", str, Integer.toString(iG));
        }
        AbstractC4256a.E("MetadataUtil", "Failed to parse uint8 attribute: " + H5.a.e(i5));
        return null;
    }

    public static int g(Y4.b bVar) {
        bVar.B(4);
        if (bVar.d() == 1684108385) {
            bVar.B(8);
            return bVar.q();
        }
        AbstractC4256a.E("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static boolean h(J5.l lVar, boolean z2, boolean z10) {
        boolean z11;
        int i5;
        int i10;
        long jI = lVar.i();
        long j8 = -1;
        int i11 = (jI > (-1L) ? 1 : (jI == (-1L) ? 0 : -1));
        long j10 = 4096;
        if (i11 != 0 && jI <= 4096) {
            j10 = jI;
        }
        int i12 = (int) j10;
        Y4.b bVar = new Y4.b(64);
        int i13 = 0;
        int i14 = 0;
        boolean z12 = false;
        while (i14 < i12) {
            bVar.x(8);
            if (!lVar.c(bVar.f16679a, i13, 8, true)) {
                break;
            }
            long jR = bVar.r();
            int iD = bVar.d();
            if (jR == 1) {
                lVar.a(8, 8, bVar.f16679a);
                bVar.z(16);
                i5 = i14;
                i10 = 16;
                jR = bVar.k();
            } else {
                if (jR == 0) {
                    long jI2 = lVar.i();
                    if (jI2 != j8) {
                        jR = (jI2 - lVar.g()) + 8;
                    }
                }
                i5 = i14;
                i10 = 8;
            }
            long j11 = i10;
            if (jR < j11) {
                return false;
            }
            int i15 = i5 + i10;
            if (iD == 1836019574) {
                i12 += (int) jR;
                if (i11 != 0 && i12 > jI) {
                    i12 = (int) jI;
                }
                i14 = i15;
            } else {
                if (iD == 1836019558 || iD == 1836475768) {
                    z11 = true;
                    break;
                }
                int i16 = i11;
                if ((i15 + jR) - j11 >= i12) {
                    break;
                }
                int i17 = (int) (jR - j11);
                i14 = i15 + i17;
                if (iD == 1718909296) {
                    if (i17 < 8) {
                        return false;
                    }
                    bVar.x(i17);
                    lVar.a(0, i17, bVar.f16679a);
                    int i18 = i17 / 4;
                    for (int i19 = 0; i19 < i18; i19++) {
                        if (i19 != 1) {
                            int iD2 = bVar.d();
                            if ((iD2 >>> 8) != 3368816 && (iD2 != 1751476579 || !z10)) {
                                int[] iArr = f10311b;
                                for (int i20 = 0; i20 < 29; i20++) {
                                    if (iArr[i20] != iD2) {
                                    }
                                }
                            }
                            z12 = true;
                            break;
                        }
                        bVar.B(4);
                    }
                    if (!z12) {
                        return false;
                    }
                } else if (i17 != 0) {
                    lVar.h(i17);
                }
                i11 = i16;
            }
            j8 = -1;
            i13 = 0;
        }
        z11 = false;
        return z12 && z2 == z11;
    }
}
