.class final Lcom/google/android/gms/internal/ads/zzvv;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final zza:Lcom/google/android/gms/internal/ads/zzvv;


# instance fields
.field private final zzb:J

.field private final zzc:J

.field private final zzd:J

.field private final zze:Lcom/google/android/gms/internal/ads/zzfi;

.field private zzf:Z

.field private zzg:J


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lcom/google/android/gms/internal/ads/zzvv;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v9, 0x0

    move-wide v3, v1

    move-wide v5, v1

    move-wide v7, v1

    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/internal/ads/zzvv;-><init>(JJJJZ)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzvv;->zza:Lcom/google/android/gms/internal/ads/zzvv;

    return-void
.end method

.method private constructor <init>(JJJJZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzvv;->zzb:J

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzvv;->zzc:J

    iput-wide p5, p0, Lcom/google/android/gms/internal/ads/zzvv;->zzd:J

    new-instance p1, Lcom/google/android/gms/internal/ads/zzfi;

    const/16 p2, 0xa

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzfi;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzvv;->zze:Lcom/google/android/gms/internal/ads/zzfi;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzvv;->zzg:J

    return-void
.end method

.method public synthetic constructor <init>(JJJJZ[B)V
    .locals 0

    .line 2
    const/4 p10, 0x0

    move-wide p8, p7

    move-wide p6, p5

    move-wide p4, p3

    move-wide p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p10}, Lcom/google/android/gms/internal/ads/zzvv;-><init>(JJJJZ)V

    return-void
.end method

.method public static synthetic zza()Lcom/google/android/gms/internal/ads/zzvv;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzvv;->zza:Lcom/google/android/gms/internal/ads/zzvv;

    return-object v0
.end method


# virtual methods
.method public final synthetic zzb()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzvv;->zzb:J

    return-wide v0
.end method

.method public final synthetic zzc()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzvv;->zzc:J

    return-wide v0
.end method

.method public final synthetic zzd()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzvv;->zzd:J

    return-wide v0
.end method

.method public final synthetic zze()Lcom/google/android/gms/internal/ads/zzfi;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvv;->zze:Lcom/google/android/gms/internal/ads/zzfi;

    return-object v0
.end method

.method public final synthetic zzf()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzvv;->zzf:Z

    return v0
.end method

.method public final synthetic zzg(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzvv;->zzf:Z

    return-void
.end method

.method public final synthetic zzh()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzvv;->zzg:J

    return-wide v0
.end method

.method public final synthetic zzi(J)V
    .locals 0

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzvv;->zzg:J

    return-void
.end method
