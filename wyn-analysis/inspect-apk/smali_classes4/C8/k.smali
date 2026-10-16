.class public final synthetic LC8/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO9/b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;ILjava/lang/String;)V
    .locals 0

    .line 1
    iput p2, p0, LC8/k;->a:I

    iput-object p1, p0, LC8/k;->b:Landroid/content/Context;

    iput-object p3, p0, LC8/k;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LC8/k;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lx9/g;

    .line 7
    .line 8
    iget-object v1, p0, LC8/k;->b:Landroid/content/Context;

    .line 9
    .line 10
    iget-object v2, p0, LC8/k;->c:Ljava/lang/String;

    .line 11
    .line 12
    invoke-direct {v0, v1, v2}, Lx9/g;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_0
    const/4 v0, 0x0

    .line 17
    iget-object v1, p0, LC8/k;->b:Landroid/content/Context;

    .line 18
    .line 19
    iget-object v2, p0, LC8/k;->c:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
