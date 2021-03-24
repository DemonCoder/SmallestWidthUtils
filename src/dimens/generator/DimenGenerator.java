package dimens.generator;

import dimens.constants.DimenTypes;
import dimens.utils.MakeUtils;

public class DimenGenerator {

    /**
     * 设计稿尺寸 dp(将自己设计师的设计稿的宽度填入)
     */
    private static final int DESIGN_WIDTH = 375;

    /**
     * 设计稿的高度dp 将自己设计师的设计稿的高度填入）
     */
    private static final int DESIGN_HEIGHT = 812;

    public static void main(String[] args) {
        int smallest = DESIGN_WIDTH>DESIGN_HEIGHT? DESIGN_HEIGHT:DESIGN_WIDTH;  //     求得最小宽度
        DimenTypes[] values = DimenTypes.values();
        for (DimenTypes value : values) {
            MakeUtils.makeAll(smallest, value, "C:/Users/chenx/Desktop/smallestwidth/dimens_sw");
        }

    }

}
