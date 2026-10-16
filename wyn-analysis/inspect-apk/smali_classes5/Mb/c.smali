.class public final synthetic LMb/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/PixelCopy$OnPixelCopyFinishedListener;


# instance fields
.field public final synthetic a:Ltf/l;

.field public final synthetic b:Landroid/graphics/Bitmap;


# direct methods
.method public synthetic constructor <init>(Ltf/l;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LMb/c;->a:Ltf/l;

    iput-object p2, p0, LMb/c;->b:Landroid/graphics/Bitmap;

    return-void
.end method


# virtual methods
.method public final onPixelCopyFinished(I)V
    .locals 2

    .line 1
    iget-object v0, p0, LMb/c;->a:Ltf/l;

    iget-object v1, p0, LMb/c;->b:Landroid/graphics/Bitmap;

    invoke-static {v0, v1, p1}, Lcom/vungle/ads/internal/util/j;->a(Ltf/l;Landroid/graphics/Bitmap;I)V

    return-void
.end method
