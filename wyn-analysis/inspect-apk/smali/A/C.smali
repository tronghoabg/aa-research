.class public final LA/C;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic i:D

.field public final synthetic j:D

.field public final synthetic k:D


# direct methods
.method public constructor <init>(DDD)V
    .locals 0

    .line 1
    iput-wide p1, p0, LA/C;->i:D

    .line 2
    .line 3
    iput-wide p3, p0, LA/C;->j:D

    .line 4
    .line 5
    iput-wide p5, p0, LA/C;->k:D

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-wide v2, p0, LA/C;->j:D

    .line 8
    .line 9
    mul-double/2addr v0, v2

    .line 10
    const/4 p1, 0x1

    .line 11
    int-to-double v4, p1

    .line 12
    add-double/2addr v4, v0

    .line 13
    iget-wide v6, p0, LA/C;->i:D

    .line 14
    .line 15
    mul-double/2addr v4, v6

    .line 16
    iget-wide v6, p0, LA/C;->k:D

    .line 17
    .line 18
    mul-double/2addr v6, v2

    .line 19
    add-double/2addr v6, v4

    .line 20
    invoke-static {v0, v1}, Ljava/lang/Math;->exp(D)D

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    mul-double/2addr v0, v6

    .line 25
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1
.end method
