.class public final Lcom/moloco/sdk/internal/publisher/nativead/ui/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/q;


# instance fields
.field public final synthetic a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;

.field public final synthetic b:Lcom/moloco/sdk/internal/publisher/nativead/ui/g;

.field public final synthetic c:LS8/d;

.field public final synthetic d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/S;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;Lcom/moloco/sdk/internal/publisher/nativead/ui/g;LS8/d;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/S;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/nativead/ui/f;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/moloco/sdk/internal/publisher/nativead/ui/f;->b:Lcom/moloco/sdk/internal/publisher/nativead/ui/g;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/moloco/sdk/internal/publisher/nativead/ui/f;->c:LS8/d;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/moloco/sdk/internal/publisher/nativead/ui/f;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/S;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, LZ/k;

    .line 2
    .line 3
    check-cast p2, LN/o;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    const-string v0, "modifier"

    .line 12
    .line 13
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    and-int/lit8 v0, p3, 0x6

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p2, p1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    const/4 v0, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v0, 0x2

    .line 29
    :goto_0
    or-int/2addr p3, v0

    .line 30
    :cond_1
    and-int/lit8 p3, p3, 0x13

    .line 31
    .line 32
    const/16 v0, 0x12

    .line 33
    .line 34
    if-ne p3, v0, :cond_3

    .line 35
    .line 36
    invoke-virtual {p2}, LN/o;->x()Z

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    if-nez p3, :cond_2

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    invoke-virtual {p2}, LN/o;->I()V

    .line 44
    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_3
    :goto_1
    new-instance p3, Lcom/moloco/sdk/internal/publisher/nativead/ui/e;

    .line 48
    .line 49
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/nativead/ui/f;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/S;

    .line 50
    .line 51
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/nativead/ui/f;->b:Lcom/moloco/sdk/internal/publisher/nativead/ui/g;

    .line 52
    .line 53
    iget-object v2, p0, Lcom/moloco/sdk/internal/publisher/nativead/ui/f;->c:LS8/d;

    .line 54
    .line 55
    invoke-direct {p3, v1, v2, p1, v0}, Lcom/moloco/sdk/internal/publisher/nativead/ui/e;-><init>(Lcom/moloco/sdk/internal/publisher/nativead/ui/g;LS8/d;LZ/k;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/S;)V

    .line 56
    .line 57
    .line 58
    const p1, 0x3dbdba72

    .line 59
    .line 60
    .line 61
    invoke-static {p2, p1, p3}, LV/e;->b(LN/o;ILef/e;)LV/d;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iget-object p3, p0, Lcom/moloco/sdk/internal/publisher/nativead/ui/f;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;

    .line 66
    .line 67
    const/4 v0, 0x6

    .line 68
    invoke-virtual {p3, p1, p2, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;->a(LV/d;LN/o;I)V

    .line 69
    .line 70
    .line 71
    :goto_2
    sget-object p1, Lef/C;->a:Lef/C;

    .line 72
    .line 73
    return-object p1
.end method
