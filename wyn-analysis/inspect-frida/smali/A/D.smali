.class public final LA/D;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic i:D

.field public final synthetic j:D

.field public final synthetic k:D

.field public final synthetic l:D

.field public final synthetic m:D


# direct methods
.method public constructor <init>(DDDDD)V
    .locals 0

    .line 1
    iput-wide p1, p0, LA/D;->i:D

    .line 2
    .line 3
    iput-wide p3, p0, LA/D;->j:D

    .line 4
    .line 5
    iput-wide p5, p0, LA/D;->k:D

    .line 6
    .line 7
    iput-wide p7, p0, LA/D;->l:D

    .line 8
    .line 9
    iput-wide p9, p0, LA/D;->m:D

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

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
    iget-wide v2, p0, LA/D;->j:D

    .line 8
    .line 9
    mul-double/2addr v2, v0

    .line 10
    invoke-static {v2, v3}, Ljava/lang/Math;->exp(D)D

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    iget-wide v4, p0, LA/D;->i:D

    .line 15
    .line 16
    mul-double/2addr v2, v4

    .line 17
    iget-wide v4, p0, LA/D;->l:D

    .line 18
    .line 19
    mul-double/2addr v4, v0

    .line 20
    invoke-static {v4, v5}, Ljava/lang/Math;->exp(D)D

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    iget-wide v4, p0, LA/D;->k:D

    .line 25
    .line 26
    mul-double/2addr v0, v4

    .line 27
    add-double/2addr v0, v2

    .line 28
    iget-wide v2, p0, LA/D;->m:D

    .line 29
    .line 30
    add-double/2addr v0, v2

    .line 31
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1
.end method
