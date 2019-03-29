/*

 * Copyright 2011 Park Jun-Hong (parkjunhong77/gmail/com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*


 * 
 * 
 * This file is generated under this project, "open-commons-json".
 *
 * Date  : 2014. 3. 12. 오후 2:45:33
 *
 * Author: Park_Jun_Hong_(fafanmama_at_naver_com)
 * 
 */

package open.commons.json.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * 사용자 정의 클래스의 생성자에서 JSON 변환을 위한 생성자를 설정하는 어노테이션
 * 
 * @author Park_Jun_Hong_(fafanmama_at_naver_com)
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.CONSTRUCTOR)
public @interface JSONConstructor {
}
