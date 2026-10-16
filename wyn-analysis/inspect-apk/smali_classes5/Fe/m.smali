.class public final LFe/m;
.super LA7/B0;
.source "SourceFile"

# interfaces
.implements LFe/a;


# instance fields
.field public final b:LCe/a;

.field public final c:LFe/h;

.field public final d:LC8/i;

.field public final e:Landroidx/fragment/app/X;

.field public final f:Lge/a;

.field public final g:LEf/E;

.field public h:Lqe/a;


# direct methods
.method public constructor <init>(LCe/a;LFe/h;Lac/a;LC8/i;Landroidx/fragment/app/X;Lge/a;)V
    .locals 2

    .line 1
    sget-object v0, LEf/S;->a:LLf/e;

    .line 2
    .line 3
    sget-object v0, LLf/d;->b:LLf/d;

    .line 4
    .line 5
    invoke-static {v0}, LEf/H;->c(Ljf/h;)LKd/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "service"

    .line 10
    .line 11
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v1, "logger"

    .line 15
    .line 16
    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v1, "delegateProvider"

    .line 20
    .line 21
    invoke-static {p4, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v1, "serializer"

    .line 25
    .line 26
    invoke-static {p5, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v1, "actionMapper"

    .line 30
    .line 31
    invoke-static {p6, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0, p3}, LA7/B0;-><init>(Lac/a;)V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, LFe/m;->b:LCe/a;

    .line 38
    .line 39
    iput-object p2, p0, LFe/m;->c:LFe/h;

    .line 40
    .line 41
    iput-object p4, p0, LFe/m;->d:LC8/i;

    .line 42
    .line 43
    iput-object p5, p0, LFe/m;->e:Landroidx/fragment/app/X;

    .line 44
    .line 45
    iput-object p6, p0, LFe/m;->f:Lge/a;

    .line 46
    .line 47
    iput-object v0, p0, LFe/m;->g:LEf/E;

    .line 48
    .line 49
    return-void
.end method

.method public static final e0(Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;)Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, LFe/i;->a:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    aget p0, v0, p0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eq p0, v0, :cond_4

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    if-eq p0, v0, :cond_3

    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    if-eq p0, v0, :cond_2

    .line 17
    .line 18
    const/4 v0, 0x4

    .line 19
    if-eq p0, v0, :cond_1

    .line 20
    .line 21
    const/4 v0, 0x5

    .line 22
    if-ne p0, v0, :cond_0

    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return-object p0

    .line 26
    :cond_0
    new-instance p0, LE5/Q;

    .line 27
    .line 28
    const/16 v0, 0x9

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-direct {p0, v1, v0}, LE5/Q;-><init>(BI)V

    .line 32
    .line 33
    .line 34
    throw p0

    .line 35
    :cond_1
    const-string p0, "year"

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_2
    const-string p0, "month"

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_3
    const-string p0, "week"

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_4
    const-string p0, "day"

    .line 45
    .line 46
    return-object p0
.end method
