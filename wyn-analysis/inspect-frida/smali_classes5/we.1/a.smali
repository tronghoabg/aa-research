.class public final Lwe/a;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:LC8/i;


# direct methods
.method public synthetic constructor <init>(LC8/i;I)V
    .locals 0

    .line 1
    iput p2, p0, Lwe/a;->i:I

    iput-object p1, p0, Lwe/a;->j:LC8/i;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lwe/a;->j:LC8/i;

    .line 2
    .line 3
    iget v1, p0, Lwe/a;->i:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, LC8/i;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, La2/v;

    .line 11
    .line 12
    sget-object v2, Lee/a;->a:[Lee/a;

    .line 13
    .line 14
    iget-object v0, v0, LC8/i;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, LC8/i;

    .line 17
    .line 18
    iget-object v2, v0, LC8/i;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Lre/d;

    .line 21
    .line 22
    iget-object v2, v2, Lre/d;->b:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v1, v1, La2/v;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Landroid/content/SharedPreferences;

    .line 27
    .line 28
    const-string v3, "sourceVersion"

    .line 29
    .line 30
    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    iget-object v0, v0, LC8/i;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Lre/d;

    .line 39
    .line 40
    iget-object v1, v0, Lre/d;->b:Ljava/lang/String;

    .line 41
    .line 42
    :cond_0
    return-object v1

    .line 43
    :pswitch_0
    iget-object v0, v0, LC8/i;->b:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, La2/v;

    .line 46
    .line 47
    sget-object v1, Lee/a;->a:[Lee/a;

    .line 48
    .line 49
    iget-object v0, v0, La2/v;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Landroid/content/SharedPreferences;

    .line 52
    .line 53
    const-string v1, "source"

    .line 54
    .line 55
    const-string v2, "android"

    .line 56
    .line 57
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    if-nez v0, :cond_1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    move-object v2, v0

    .line 65
    :goto_0
    return-object v2

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
