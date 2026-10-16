.class public final synthetic LR8/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LR8/s;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LR8/s;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p4, p0, LR8/q;->a:I

    iput-object p1, p0, LR8/q;->b:LR8/s;

    iput-object p2, p0, LR8/q;->c:Ljava/lang/String;

    iput-object p3, p0, LR8/q;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, LR8/q;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR8/q;->b:LR8/s;

    .line 7
    .line 8
    iget-object v0, v0, LR8/s;->h:LR8/m;

    .line 9
    .line 10
    iget-object v1, p0, LR8/q;->c:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v2, p0, LR8/q;->d:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, LR8/m;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, LR8/q;->c:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v1, p0, LR8/q;->d:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v2, p0, LR8/q;->b:LR8/s;

    .line 23
    .line 24
    iget-object v2, v2, LR8/s;->h:LR8/m;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    :try_start_0
    iget-object v3, v2, LR8/m;->d:LX8/c;

    .line 30
    .line 31
    iget-object v3, v3, LX8/c;->d:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v3, LA7/b0;

    .line 34
    .line 35
    invoke-virtual {v3, v0, v1}, LA7/b0;->s(Ljava/lang/String;Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :catch_0
    move-exception v0

    .line 40
    iget-object v1, v2, LR8/m;->a:Landroid/content/Context;

    .line 41
    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iget v1, v1, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 49
    .line 50
    and-int/lit8 v1, v1, 0x2

    .line 51
    .line 52
    if-nez v1, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    throw v0

    .line 56
    :cond_1
    :goto_0
    const-string v0, "Attempting to set custom attribute with null key, ignoring."

    .line 57
    .line 58
    const/4 v1, 0x0

    .line 59
    const-string v2, "FirebaseCrashlytics"

    .line 60
    .line 61
    invoke-static {v2, v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 62
    .line 63
    .line 64
    :goto_1
    return-void

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
