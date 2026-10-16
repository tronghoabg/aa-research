.class public final LM0/a;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Lt0/t;

.field public final synthetic k:LM0/o;


# direct methods
.method public constructor <init>(LM0/o;Lt0/t;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LM0/a;->i:I

    .line 1
    iput-object p2, p0, LM0/a;->j:Lt0/t;

    iput-object p1, p0, LM0/a;->k:LM0/o;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(LM0/o;Lt0/t;I)V
    .locals 0

    .line 2
    iput p3, p0, LM0/a;->i:I

    iput-object p1, p0, LM0/a;->k:LM0/o;

    iput-object p2, p0, LM0/a;->j:Lt0/t;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Lef/C;->a:Lef/C;

    .line 2
    .line 3
    iget-object v1, p0, LM0/a;->j:Lt0/t;

    .line 4
    .line 5
    iget-object v2, p0, LM0/a;->k:LM0/o;

    .line 6
    .line 7
    iget v3, p0, LM0/a;->i:I

    .line 8
    .line 9
    packed-switch v3, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Lr0/k;

    .line 13
    .line 14
    const-string v3, "it"

    .line 15
    .line 16
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v2, v1}, LU8/v0;->i(LM0/o;Lt0/t;)V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    check-cast p1, Lg0/d;

    .line 24
    .line 25
    const-string v3, "$this$drawBehind"

    .line 26
    .line 27
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p1}, Lg0/d;->u()Lba/a;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Lba/a;->v()Le0/o;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iget-object v1, v1, Lt0/t;->g:Lu0/n;

    .line 39
    .line 40
    instance-of v3, v1, Lu0/n;

    .line 41
    .line 42
    if-eqz v3, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 v1, 0x0

    .line 46
    :goto_0
    if-eqz v1, :cond_1

    .line 47
    .line 48
    sget-object v3, Le0/c;->a:Landroid/graphics/Canvas;

    .line 49
    .line 50
    const-string v3, "<this>"

    .line 51
    .line 52
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    check-cast p1, Le0/b;

    .line 56
    .line 57
    iget-object p1, p1, Le0/b;->a:Landroid/graphics/Canvas;

    .line 58
    .line 59
    const-string v3, "canvas"

    .line 60
    .line 61
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Lu0/n;->getAndroidViewsHandler$ui_release()Lu0/F;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 72
    .line 73
    .line 74
    :cond_1
    return-object v0

    .line 75
    :pswitch_1
    check-cast p1, Lr0/s;

    .line 76
    .line 77
    const-string v3, "$this$layout"

    .line 78
    .line 79
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v2, v1}, LU8/v0;->i(LM0/o;Lt0/t;)V

    .line 83
    .line 84
    .line 85
    return-object v0

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
