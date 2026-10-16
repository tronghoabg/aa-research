.class public final synthetic Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:LV/d;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;LV/d;II)V
    .locals 0

    .line 1
    iput p4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/a;->a:I

    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/a;->b:Ljava/lang/String;

    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/a;->c:LV/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/a;->a:I

    .line 2
    .line 3
    check-cast p1, LN/o;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/a;->c:LV/d;

    .line 14
    .line 15
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/a;->b:Ljava/lang/String;

    .line 16
    .line 17
    const/16 v1, 0x31

    .line 18
    .line 19
    invoke-static {v0, p2, p1, v1}, LS3/f;->d(Ljava/lang/String;LV/d;LN/o;I)V

    .line 20
    .line 21
    .line 22
    sget-object p1, Lef/C;->a:Lef/C;

    .line 23
    .line 24
    return-object p1

    .line 25
    :pswitch_0
    iget-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/a;->c:LV/d;

    .line 26
    .line 27
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/a;->b:Ljava/lang/String;

    .line 28
    .line 29
    const/16 v1, 0x31

    .line 30
    .line 31
    invoke-static {v0, p2, p1, v1}, LS3/f;->d(Ljava/lang/String;LV/d;LN/o;I)V

    .line 32
    .line 33
    .line 34
    sget-object p1, Lef/C;->a:Lef/C;

    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
